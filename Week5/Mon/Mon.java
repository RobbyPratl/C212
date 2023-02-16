public class Mon {

    /**
     * 
     * @param sideLength
     * @return
     */
    public static double cubeVolume(double sideLength) {
        double volume = sideLength * sideLength * sideLength;
        return volume;
    }

    public static void modifyValue(int n) {
        n++;
        System.out.println("In modify value n = " + n);
    }

    public static int sign(double x) {
        if (x < 0) {
            return -1;
        } else if (x > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        double side = 5;
        double volume = cubeVolume(side);
        System.out.println(volume);

        int m = 10;
        System.out.println("Before n= " + m);
        modifyValue(m);
        System.out.println("After n= " + m);
    }
}
