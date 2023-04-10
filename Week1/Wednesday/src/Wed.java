package Week1.Wednesday.src;

public class Wed {
    public static void main(String[] args) {
        int cansPerPack = 6;
        final double CAN_VOLUME = 0.355;
        double totalVolume = cansPerPack * CAN_VOLUME;
        System.out.println("Total volume of pack " + totalVolume + " liters");
    }
}
