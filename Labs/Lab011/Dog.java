package Labs.Lab011;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // if a dog meets another animal like a cat, it will say "Woof"
    // but if it meets another dog, it will say "Woof Woof"

    @Override
    public String greets(Animal petBeingGreeted) {
        if (petBeingGreeted instanceof Dog) {
            return "Howl";
        } else {
            return "Woof";
        }
    }
}
