import java.util.ArrayList;
import java.util.Scanner;

public class TicTacToe {
    // Static variables for the TicTacToe class, effectively configuration options
    // Use these instead of hard-coding ' ', 'X', and 'O' as symbols for the game
    // In other words, changing one of these variables should change the program
    // to use that new symbol instead without breaking anything
    // Do NOT add additional static variables to the class!
    static char emptySpaceSymbol = ' ';
    static char playerOneSymbol = 'X';
    static char playerTwoSymbol = 'O';

    private static String displayGameFromState(char[][] state) {
        // Given a state, return a String which is the textual representation of the
        // tic-tac-toe board at that state.
        // Hint: Make use of the newline character \n to get everything into one String
        // It would be best practice to do this with a loop, but since we hardcode the
        // game to only use 3x3 boards
        // it's fine to do this without one.

        String game = "";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                game += state[i][j];
            }
            game += "\n";
        }

        return game;

    }

    private static char[][] getInitialGameState() {
        // Returns the state of a game that has just started.
        // This method is implemented for you. You can use it as an example of how to
        // utilize the static class variables.
        // As you can see, you can use it just like any other variable, since it is
        // instantiated and given a value already.

        return new char[][] { { emptySpaceSymbol, emptySpaceSymbol, emptySpaceSymbol },
                { emptySpaceSymbol, emptySpaceSymbol, emptySpaceSymbol },
                { emptySpaceSymbol, emptySpaceSymbol, emptySpaceSymbol } };
    }

    private static boolean checkValidMove(int[] move, char[][] state) {
        // Given a [row, col] move, return true if a space is unclaimed.
        // Doesn't need to check whether move is within bounds of the board.

        int row = move[0];
        int col = move[1];

        if (state[row][col] == emptySpaceSymbol) {
            return true;
        }

        return false;
    }

    // Given a game state, return an ArrayList of [row, column] positions that are
    // unclaimed on the board
    private static ArrayList<int[]> getValidMoves(char[][] gameState) {

        ArrayList<int[]> validMoves = new ArrayList<int[]>();

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (checkValidMove(new int[] { row, col }, gameState)) {
                    validMoves.add(new int[] { row, col });
                }
            }
        }

        return validMoves;
    }

    private static char[][] runPlayerMove(String playerName, char playerSymbol, char[][] currentState) {
        // Repeatedly prompts player for move in current state, returning new state
        // after their valid move is made

        int[] move = getInBoundsPlayerMove(playerName);

        while (!checkValidMove(move, currentState)) {
            System.out.println("That space is already taken. Please try again.");
            move = getInBoundsPlayerMove(playerName);
        }

        return makeMove(move, playerSymbol, currentState);
    }

    private static char[][] makeMove(int[] move, char symbol, char[][] currentState) {
        // Given a [row, col] move, the symbol to add, and a game state,
        // Return a NEW array (do NOT modify the argument currentState) with the new
        // game state
        // Hint: Make use of Arrays.copyOf() somehow to copy a 1D array easily
        // You may need to use it multiple times for a 1D array

        int row = move[0];
        int col = move[1];

        char[][] newState = new char[3][3];

        for (int i = 0; i < currentState.length; i++) {
            for (int j = 0; j < currentState[i].length; j++) {
                newState[i][j] = currentState[i][j];
            }
        }

        newState[row][col] = symbol;

        return newState;

    }

    private static int[] getInBoundsPlayerMove(String playerName) {
        // Repeatedly prompts player for move. Returns [row, column] of their desired
        // move such that row & column are on
        // the 3x3 board, but does not check for availability of that space.

        Scanner input = new Scanner(System.in);

        System.out.println(playerName + ", please enter your move (row, column): ");
        int row = input.nextInt();
        int col = input.nextInt();

        while (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("That move is out of bounds. Please try again.");
            System.out.println(playerName + ", please enter your move (row, column): ");
            row = input.nextInt();
            col = input.nextInt();
        }
        input.close();
        return new int[] { row, col };

    }

    // Given a state, return true if some player has won in that state
    private static boolean checkWin(char[][] state) {
        // TODO
        // Hint: no need to check if player one has won and if player two has won in
        // separate steps,
        // you can just check if the same symbol occurs three times in any row, col, or
        // diagonal (except empty space symbol)
        // But either implementation is valid: do whatever makes most sense to you.
        // Horizontals
        for (int row = 0; row < 3; row++) {
            if (state[row][0] == state[row][1] && state[row][1] == state[row][2] && state[row][0] != '-') {
                return true;
            }
        }
        // Verticals
        for (int col = 0; col < 3; col++) {
            if (state[0][col] == state[1][col] && state[1][col] == state[2][col] && state[0][col] != '-') {
                return true;
            }
        }
        // Diagonals
        if (state[0][0] == state[1][1] && state[1][1] == state[2][2] && state[0][0] != '-') {
            return true;
        }
        if (state[0][2] == state[1][1] && state[1][1] == state[2][0] && state[0][2] != '-') {
            return true;
        }

        return false;
    }

    // Given a state, simply checks whether all spaces are occupied. Does not care
    // or check if a player has won.
    private static boolean checkDraw(char[][] state) {

        for (int i = 0; i < state.length; i++) {
            for (int j = 0; j < state[i].length; j++) {
                if (state[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    // Given a game state, return a new game state with move from the AI
    // It follows the algorithm in the PDF to ensure a tie (or win if possible)
    private static char[][] getCPUMove(char[][] gameState) {

        // Hint: you can call makeMove() and not end up returning the result, in order
        // to "test" a move
        // and see what would happen. This is one reason why makeMove() does not modify
        // the state argument

        // Determine all available spaces
        ArrayList<int[]> validMoves = getValidMoves(gameState);

        // Check if there's a winning move for the AI and define cpuSymbol
        char cpuSymbol = 'O';
        for (int[] move : validMoves) {
            char[][] testState = makeMove(move, cpuSymbol, gameState);
            if (checkWin(testState)) {
                return testState;
            }
        }

        // If not, check if opponent has a winning move, and if so, make a move there

        char playerSymbol = 'X';
        for (int[] move : validMoves) {
            char[][] testState = makeMove(move, playerSymbol, gameState);
            if (checkWin(testState)) {
                return testState;
            }
        }

        // If not, move on center space if possible

        int[] centerMove = { 1, 1 };
        if (checkValidMove(centerMove, gameState)) {
            return makeMove(centerMove, cpuSymbol, gameState);
        }

        // If not, move on corner spaces if possible (in order of preference)

        int[][] cornerMoves = { { 0, 0 }, { 0, 2 }, { 2, 0 }, { 2, 2 } };
        for (int[] move : cornerMoves) {
            if (checkValidMove(move, gameState)) {
                return makeMove(move, cpuSymbol, gameState);
            }
        }

        // Otherwise, move in any available spot

        return makeMove(validMoves.get(0), cpuSymbol, gameState);

    }

    // Given player names and the game history, display the past game as in the PDF
    // sample code output
    private static void runGameHistory(String[] playerNames, ArrayList<char[][]> gameHistory) {
        // TODO
        // We have the names of the players in the format [playerOneName, playerTwoName]
        // Player one always gets 'X' while player two always gets 'O'
        // However, we do not know yet which player went first, but we'll need to
        // know...
        // Hint for the above: which symbol appears after one turn is taken?

        playerNames[0] = playerNames[0].substring(0, 1).toUpperCase() + playerNames[0].substring(1);
        playerNames[1] = playerNames[1].substring(0, 1).toUpperCase() + playerNames[1].substring(1);

        System.out.println("Game History:");
        System.out.println("-------------");
        System.out.println("Player 1: " + playerNames[0]);
        System.out.println("Player 2: " + playerNames[1]);
        System.out.println("-------------");

        char[][] firstState = gameHistory.get(0);
        char[][] secondState = gameHistory.get(1);

        if (firstState[1][1] == 'X') {
            System.out.println(playerNames[0] + " goes first");
        } else {
            System.out.println(playerNames[1] + " goes first");
        }

        for (int i = 0; i < gameHistory.size(); i++) {
            System.out.println("Turn " + (i + 1) + ":");
            displayGameFromState(gameHistory.get(i));
        }

        if (checkWin(secondState)) {
            System.out.println(playerNames[1] + " wins!");
        } else if (checkWin(firstState)) {
            System.out.println(playerNames[0] + " wins!");
        } else {
            System.out.println("It's a draw!");
        }

    }

    private static ArrayList<char[][]> runOnePlayerGame(String[] playerNames) {
        // Given the player names (where player two is "Computer"),
        // Run the one-player game.
        // use the checkDraw() method to check if the game is a draw
        // use the checkWin() method to check if the game is won
        // use the getCPUMove() method to get the CPU's move
        // Return an ArrayList of game states of each turn -- in other words, the
        // gameHistory

        ArrayList<char[][]> gameHistory = new ArrayList<char[][]>();
        char[][] gameState = getInitialGameState();
        gameHistory.add(gameState);
        displayGameFromState(gameState);

        while (!checkDraw(gameState) && !checkWin(gameState)) {
            gameState = runPlayerMove(playerNames[0], playerOneSymbol, gameState);
            gameHistory.add(gameState);
            displayGameFromState(gameState);

            if (!checkDraw(gameState) && !checkWin(gameState)) {
                gameState = getCPUMove(gameState);
                gameHistory.add(gameState);
                displayGameFromState(gameState);
            }
        }

        return gameHistory;
    }

    private static ArrayList<char[][]> runTwoPlayerGame(String[] playerNames) {
        // Given the player names, run the two-player game.
        // use the checkDraw() method to check if the game is a draw
        // use the checkWin() method to check if the game is won
        // Return an ArrayList of game states of each turn -- in other words, the
        // gameHistory

        ArrayList<char[][]> gameHistory = new ArrayList<char[][]>();
        char[][] gameState = getInitialGameState();
        gameHistory.add(gameState);
        displayGameFromState(gameState);

        while (!checkDraw(gameState) && !checkWin(gameState)) {
            gameState = runPlayerMove(playerNames[0], playerOneSymbol, gameState);
            gameHistory.add(gameState);
            displayGameFromState(gameState);

            if (!checkDraw(gameState) && !checkWin(gameState)) {
                gameState = runPlayerMove(playerNames[1], playerTwoSymbol, gameState);
                gameHistory.add(gameState);
                displayGameFromState(gameState);
            }
        }

        return gameHistory;

    }

    public static void main(String[] args) {
        // TODO
        // This is where the main menu system of the program will be written.
        // Hint: Since many of the game runner methods take in an array of player names,
        // you'll probably need to collect names here.
        // Main menu collect the names of the players and run the game dont use runGame
        // method
        // because it will not add the game to the game history
        // Make sure you use the methods: displayGameFromState, getInitialGameState,
        // runTwoPlayerGame, runOnePlayerGame, runPlayerMove, getInBoundsMove,
        // checkValidMove, makeMove, checkWin, checkDraw, getCPUMove, getValidMoves,
        // runGameHistory

        Scanner input = new Scanner(System.in);
        String[] playerNames = new String[2];
        ArrayList<char[][]> gameHistory = new ArrayList<char[][]>();

        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("Would you like to play a two player game or a one player game?");
        System.out.println("Enter 1 for a two player game or 2 for a one player game");
        int gameType = input.nextInt();

        if (gameType == 1) {
            System.out.println("Enter the name of player one");
            playerNames[0] = input.next();
            System.out.println("Enter the name of player two");
            playerNames[1] = input.next();
            gameHistory = runTwoPlayerGame(playerNames);
        } else if (gameType == 2) {
            System.out.println("Enter the name of player one");
            playerNames[0] = input.next();
            playerNames[1] = "Computer";
            gameHistory = runOnePlayerGame(playerNames);
        } else {
            System.out.println("Invalid input");
        }

        runGameHistory(playerNames, gameHistory);

        // checks if the user wants to play again
        System.out.println("Would you like to play again? Enter 1 for yes or 2 for no");
        int playAgain = input.nextInt();
        if (playAgain == 1) {
            main(args);
        } else if (playAgain == 2) {
            System.out.println("Thanks for playing!");
        } else {
            System.out.println("Invalid input");
        }

        // checks if the user wants to see the game history
        System.out.println("Would you like to see the game history? Enter 1 for yes or 2 for no");
        int gameHistoryChoice = input.nextInt();
        if (gameHistoryChoice == 1) {
            runGameHistory(playerNames, gameHistory);
        } else if (gameHistoryChoice == 2) {
            System.out.println("Thanks for playing!");
        } else {
            System.out.println("Invalid input");
        }

    }

}
