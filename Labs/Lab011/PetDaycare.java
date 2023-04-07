package Labs.Lab011;

import java.util.ArrayList;

import javax.print.attribute.standard.MediaSize.Other;

public class PetDaycare {
    ArrayList<Animal> pets;

    public PetDaycare(ArrayList<Animal> pets) {
        this.pets = pets;
    }

    private String addToSoundTable(String soundTable, String newSound) {
        return soundTable + String.format("%-16s", newSound);
    }

    public String[][] createSoundArray() {
        String[][] soundArray = new String[pets.size()][pets.size()];
        for (int i = 0; i < pets.size(); i++) {
            for (int j = 0; j < pets.size(); j++) {
                soundArray[i][j] = petGreetsPet(pets.get(i), pets.get(j));
            }
        }
        return soundArray;
    }

    private String petGreetsPet(Animal petDoingTheGreeting, Animal petBeingGreeted) {
        // // we need to find out what specific classes these pets are instances of, and
        // cast them to that
        // // Without the use of some other OO concepts we haven't seen yet, this gets
        // complicated
        // // We have to check each combination of possible Animal subtypes to get the
        // "right" greeting
        // // (if it matters to that Animal subtype: e.g. a _____ and _____ cares what
        // it is greeting but a _____ does not)
        // // Also, we have to check the most specific subtypes first, since a _____ is
        // a Dog,
        // // so we start with _____, then _____, then _____
        // // Notice if we added more Animal subtypes we'd have to manually update this
        // method!! This is not ideal!

        // if (petDoingTheGreeting instanceof Chihuahua) {
        // if (petBeingGreeted instanceof Chihuahua) {
        // return ((Chihuahua) petDoingTheGreeting).greets((Chihuahua) petBeingGreeted);
        // } else if (petBeingGreeted instanceof Dog) {
        // return ((Chihuahua) petBeingGreeted).greets((Dog) petBeingGreeted);
        // } else if (petBeingGreeted instanceof Cat) {
        // return ().greets((Cat) petBeingGreeted);
        // } else if (petDoingTheGreeting instanceof Dog) {
        // if (petBeingGreeted instanceof Dog) {

        // } else {

        // }
        // } else if (petDoingTheGreeting instanceof Cat) {
        // return petDoingTheGreeting.greets(petBeingGreeted);
        // } throw new IllegalArgumentException("Unsupported animal interaction");
        if (petDoingTheGreeting instanceof Chihuahua) {
            if (petBeingGreeted instanceof Chihuahua) {
                return ((Chihuahua) petDoingTheGreeting).greetsC((Chihuahua) petBeingGreeted);
            } else if (petBeingGreeted instanceof Dog) {
                return ((Chihuahua) petDoingTheGreeting).greetsD((Dog) petBeingGreeted);
            } else if (petBeingGreeted instanceof Cat) {
                return ((Chihuahua) petDoingTheGreeting).greets((Cat) petBeingGreeted);
            }
        } else if (petDoingTheGreeting instanceof Dog) {
            if (petBeingGreeted instanceof Chihuahua) {
                return ((Dog) petDoingTheGreeting).greets((Chihuahua) petBeingGreeted);
            } else if (petBeingGreeted instanceof Dog) {
                // howl at the dog
                return ((Dog) petDoingTheGreeting).greets((Dog) petBeingGreeted);
            } else if (petBeingGreeted instanceof Cat) {
                return ((Dog) petDoingTheGreeting).greets((Cat) petBeingGreeted);
            }
        } else if (petDoingTheGreeting instanceof Cat) {
            return petDoingTheGreeting.greets(petBeingGreeted);
        } else {
            throw new IllegalArgumentException("Unsupported animal interaction");
        }
        return null;
    }

    // displays the sound table
    @Override
    public String toString() {
        String soundTable = "";
        String[][] soundArray = createSoundArray(); // change this to
        for (int i = -1; i < pets.size(); i++) {
            for (int j = -1; j < pets.size(); j++) { // changed from "-1" to
                // i or j == -1 means we are adding a label to our "table"
                // both means we add the title, i.e. the top-left cell
                try {
                    if (i == -1) {
                        soundTable = addToSoundTable(soundTable, pets.get(j).getName()); // top
                    } else {
                        if (j == -1) {
                            soundTable = addToSoundTable(soundTable, pets.get(i).getName()); // left
                            // name
                        } else if (i == j) { // changed from "...)" to "i == j)"
                            soundTable = addToSoundTable(soundTable, "---"); // the diagonals
                        } else {
                            soundTable = addToSoundTable(soundTable, soundArray[i][j]);
                        }
                    }
                } catch (IndexOutOfBoundsException e) {
                    soundTable = addToSoundTable(soundTable, "Meet and Greet!"); // the title
                }
            }
            soundTable += "\n";
        }
        return soundTable;
    }
}
