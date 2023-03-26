
public class Rhombus {
    private int height;

    public int getHeight() {
        return height;
    }

    public Rhombus(int height) {
        if (height % 2 == 0) {
            throw new IllegalArgumentException("Sorry only odd numbers are allowed for height");
        }
        this.height = height;
    }

    public String getShape() {
        String result = "";
        int mid = height / 2;

        for (int i = 0; i < height; i++) {
            int spaces = Math.abs(mid - i);
            int stars = height - spaces * 2;
            for (int j = 0; j < spaces; j++) {
                result += " ";
            }
            for (int j = 0; j < stars; j++) {
                result += "*";
            }
            result += "\n";
        }
        return result.substring(0, result.length() - 1);
    }

    public void printShape() {
        System.out.println(getShape());
    }
}
