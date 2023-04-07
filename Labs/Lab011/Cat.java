package Labs.Lab011;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String greets(Animal petBeingGreeted) {
        return "Meow";
    }
}
