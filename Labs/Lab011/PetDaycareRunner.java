package Labs.Lab011;

import java.util.ArrayList;
import java.util.Arrays;

public class PetDaycareRunner {
    public static void main(String[] args) {
        ArrayList<Animal> pets = new ArrayList<>(Arrays.asList(new Cat("Lucy"),
                new Dog("Sparky"),
                new Chihuahua("Fred"),
                new Chihuahua("Tripod")));
        PetDaycare pdc = new PetDaycare(pets);
        System.out.println(pdc);
    }
}
