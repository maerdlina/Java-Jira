package AnimalSystem.src.main.java.org.system.animals;

import org.system.roles.Predator;
import AnimalSystem.src.main.java.org.system.subtype.Bird;
import AnimalSystem.src.main.java.org.system.transfer.Diet;

public class Owl extends Bird implements Predator {

    @Override
    public String getName(String name) {
        return name;
    }

    @Override
    public Diet getDiet() {
        return Diet.CARNIVORE;
    }

    @Override
    public void hunt() {
        System.out.println("Owl HUNT!!!");
    }

    @Override
    public void fly() {

    }
}
