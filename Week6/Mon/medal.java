public class medal {
    public static void main(String[] args) {
        final int countries = 7;
        final int medals = 3;
        int[][] counts = {
                { 1, 0, 1 },
                { 1, 1, 0 },
                { 0, 0, 1 },
                { 1, 0, 0 },
                { 0, 1, 1 },
                { 1, 1, 0 }
        };

        String[] countriesName = { "Canda", "USA", "China", "Korea", "Japan", "Russia", "Germany" };

        for (int i = 0; i <= countries; i++) {
            System.out.print(countriesName[i] + "\t");
            for (int j = 0; j < medals; j++) {
                System.out.print(counts[i][j] + "\t");
            }
        }
    }
}
