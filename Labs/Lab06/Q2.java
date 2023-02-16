public class Q2 {
    public static int[][] swapColumns(int[][] array, int col1, int col2) {
        int[][] newArray = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                newArray[i][j] = array[i][j];
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            int temp = newArray[i][col1];
            newArray[i][col1] = newArray[i][col2];
            newArray[i][col2] = temp;
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] newArray = swapColumns(array, 0, 2);
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[0].length; j++) {
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }
    }

}
