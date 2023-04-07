package Labs.Lab011;

public class Chihuahua extends Dog {
    public Chihuahua(String name) {
        super(name);
    }

    @Override
    public String greets(Animal petBeingGreeted) {
        return "Arf";
    }

    public String greetsD(Dog other) {
        return "Arf Arf";
    }

    public String greetsC(Chihuahua other) {
        return "Como estas";
    }
}
