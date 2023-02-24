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

    public static void main(String[] args) {
        // TODO
        // This is where the main menu system of the program will be written.
        // Hint: Since many of the game runner methods take in an array of player names,
        // you'll probably need to collect names here.
        // Main menu collect the names of the players and run the game dont use runGame
        // method
        // Make sure board is displayed after every move
        // Ask for what game type first and then ask for names

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("Enter 1 for single player");
        System.out.println("Enter 2 for two player");
        System.out.println("Enter 3 for Game History");
        System.out.println("Enter 4 to exit");
        int gameType = sc.nextInt();
        String[] playerNames = new String[2];
        String recordRagnarok = "";
        ArrayList<char[][]> gameHistory = new ArrayList<char[][]>();

        while (gameType != 4) {
            if (gameType == 1) {
                System.out.println("Enter player name: ");
                playerNames[0] = sc.next();
                playerNames[1] = "Computer";
                gameHistory = runOnePlayerGame(playerNames);
                if (checkWin(gameHistory.get(gameHistory.size() - 1))) {
                    recordRagnarok = playerNames[0] + "(W) " + playerNames[1] + "(L)";
                } else if (checkWin(gameHistory.get(gameHistory.size() - 2))) {
                    recordRagnarok = playerNames[0] + "(L) " + playerNames[1] + "(W)";

                } else {
                    recordRagnarok = playerNames[0] + "(T) " + playerNames[1] + "(T)";

                }

            } else if (gameType == 2) {
                System.out.println("Enter player 1 name: ");
                playerNames[0] = sc.next();
                System.out.println("Enter player 2 name: ");
                playerNames[1] = sc.next();
                gameHistory = runTwoPlayerGame(playerNames);
                if (checkWin(gameHistory.get(gameHistory.size() - 1))) {
                    recordRagnarok = playerNames[0] + "(W) " + playerNames[1] + "(L)";
                } else if (checkWin(gameHistory.get(gameHistory.size() - 2))) {
                    recordRagnarok = playerNames[0] + "(L) " + playerNames[1] + "(W)";

                } else {
                    recordRagnarok = playerNames[0] + "(T) " + playerNames[1] + "(T)";

                }

            } else if (gameType == 3) {
                if (recordRagnarok == "") {
                    System.out.println("Invalid");
                } else {
                    runGameHistory(playerNames, gameHistory);
                }

            } else {
                System.out.println("Invalid input");
            }

            System.out.println("Enter 1 for single player");
            System.out.println("Enter 2 for two player");
            System.out.println("Enter 3 for Game History");
            System.out.println("Enter 4 to exit");
            System.out.println(recordRagnarok);
            gameType = sc.nextInt();
        }
        System.out.println();
        System.out.println("GoodBye!!!");
        System.out.println();

    }

    private static String displayGameFromState(char[][] state) {
        String board = "";
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board += "| " + state[row][col] + " ";
            }
            board += "|\n";
            if (row < 2) {
                board += "-------------\n";
            }
        }

        return board;
    }

    private static char[][] getInitialGameState() {
        return new char[][] { { emptySpaceSymbol, emptySpaceSymbol, emptySpaceSymbol },
                { emptySpaceSymbol, emptySpaceSymbol, emptySpaceSymbol },
                { emptySpaceSymbol, emptySpaceSymbol, emptySpaceSymbol } };
    }

    private static boolean checkValidMove(int[] move, char[][] state) {

        int row = move[0];
        int col = move[1];

        if (state[row][col] == emptySpaceSymbol) {
            return true;
        } else {
            return false;
        }
    }

    private static ArrayList<int[]> getValidMoves(char[][] gameState) {
        ArrayList<int[]> validMoves = new ArrayList<int[]>();

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (gameState[row][col] == emptySpaceSymbol) {
                    int[] move = { row, col };
                    validMoves.add(move);
                }
            }
        }

        return validMoves;
    }

    private static char[][] runPlayerMove(String playerName, char playerSymbol, char[][] currentState) {
        int[] move = getInBoundsPlayerMove(playerName);
        while (!checkValidMove(move, currentState)) {
            System.out.println("Invalid move");
            move = getInBoundsPlayerMove(playerName);
        }
        return makeMove(move, playerSymbol, currentState);

    }

    private static char[][] makeMove(int[] move, char symbol, char[][] currentState) {
        int row = move[0];
        int col = move[1];

        currentState[row][col] = symbol;

        return currentState;
    }

    private static int[] getInBoundsPlayerMove(String playerName) {
        Scanner sc = new Scanner(System.in);
        int[] playerMove = new int[2];
        int row = 0;
        int column = 0;
        System.out.println("Please enter your move:");
        System.out.print("Enter Row:");
        row = sc.nextInt();
        System.out.print("Enter Column:");
        column = sc.nextInt();
        playerMove[0] = row;
        playerMove[1] = column;
        return playerMove;

    }

    private static boolean checkWin(char[][] state) {

        for (int i = 0; i < state.length; i++) {
            if (state[i][0] == state[i][1] && state[i][1] == state[i][2] && state[i][0] != emptySpaceSymbol) {
                return true;
            }
        }

        for (int i = 0; i < state.length; i++) {
            if (state[0][i] == state[1][i] && state[1][i] == state[2][i] && state[0][i] != emptySpaceSymbol) {
                return true;
            }
        }

        if (state[0][0] == state[1][1] && state[1][1] == state[2][2] && state[0][0] != emptySpaceSymbol) {
            return true;
        }

        if (state[0][2] == state[1][1] && state[1][1] == state[2][0] && state[0][2] != emptySpaceSymbol) {
            return true;
        }

        return false;
    }

    private static boolean checkDraw(char[][] state) {
        for (int i = 0; i < state.length; i++) {
            for (int j = 0; j < state[i].length; j++) {
                if (state[i][j] == emptySpaceSymbol) {
                    return false;
                }
            }
        }
        return true;
    }

    private static char[][] getCPUMove(char[][] gameState) {
        ArrayList<int[]> validMoves = getValidMoves(gameState);
        int[] move = validMoves.get((int) (Math.random() * validMoves.size()));
        char cpuSymbol = 'O';
        return makeMove(move, cpuSymbol, gameState);
    }

    private static ArrayList<char[][]> runOnePlayerGame(String[] playerNames) {
        boolean cpuGoesFirst = Math.random() < 0.5;
        ArrayList<char[][]> gameHistory = new ArrayList<char[][]>();
        char[][] gameState = getInitialGameState();
        gameHistory.add(gameState);
        System.out.println(displayGameFromState(gameState));
        if (cpuGoesFirst) {
            gameState = getCPUMove(gameState);
            gameHistory.add(gameState);
            System.out.println(displayGameFromState(gameState));
        }
        while (!checkDraw(gameState) && !checkWin(gameState)) {
            gameState = runPlayerMove(playerNames[0], playerOneSymbol, gameState);
            gameHistory.add(gameState);
            System.out.println(displayGameFromState(gameState));
            if (!checkDraw(gameState) && !checkWin(gameState)) {
                gameState = getCPUMove(gameState);
                gameHistory.add(gameState);
                System.out.println(displayGameFromState(gameState));
            }
        }

        return gameHistory;

    }

    private static ArrayList<char[][]> runTwoPlayerGame(String[] playerNames) {
        ArrayList<char[][]> gameHistory = new ArrayList<char[][]>();
        char[][] gameState = getInitialGameState();
        gameHistory.add(gameState);
        System.out.println(displayGameFromState(gameState));

        while (!checkDraw(gameState) && !checkWin(gameState)) {
            System.out.println(playerNames[0] + "'s Move");
            gameState = runPlayerMove(playerNames[0], playerOneSymbol, gameState);
            gameHistory.add(gameState);
            System.out.println(displayGameFromState(gameState));

            if (!checkDraw(gameState) && !checkWin(gameState)) {
                System.out.println(playerNames[0] + "Move");
                gameState = runPlayerMove(playerNames[1], playerTwoSymbol, gameState);
                gameHistory.add(gameState);
                System.out.println(displayGameFromState(gameState));
            }
        }
        if (checkWin(gameHistory.get(gameHistory.size() - 1))) {
            System.out.println("Game over, " + playerNames[0] + " wins!");
        } else if (checkWin(gameHistory.get(gameHistory.size() - 2))) {
            System.out.println("Game over, CPU wins!");
        } else {
            System.out.println("Game over, it's a draw!");
        }

        return gameHistory;

    }

    private static void runGameHistory(String[] playerNames, ArrayList<char[][]> gameHistory) {
        for (int i = 0; i < gameHistory.size(); i++) {
            System.out.println(displayGameFromState(gameHistory.get(i)));
        }

        if (checkWin(gameHistory.get(gameHistory.size() - 1))) {
            System.out.println("Game over, " + playerNames[0] + " wins!");
        } else if (checkWin(gameHistory.get(gameHistory.size() - 2))) {
            System.out.println("Game over, CPU wins!");
        } else {
            System.out.println("Game over, it's a draw!");
        }
    }
}
