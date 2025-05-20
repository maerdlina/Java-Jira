package AnimalSystem.src.main.java.org.system.animals;

import AnimalSystem.src.main.java.org.system.Animal;
import org.system.roles.Predator;
import AnimalSystem.src.main.java.org.system.subtype.CatLike;

public class Tiger extends CatLike implements Predator {
    @Override
    public void hunt() {
        System.out.println("Tiger hunt....!");
    }

    @Override
    public String getName(String name) {
        return name;
    }
}
