package AnimalSystem.src.main.java.org.system.subtype;

import AnimalSystem.src.main.java.org.system.Animal;
import org.system.roles.Predator;
import AnimalSystem.src.main.java.org.system.transfer.AnimalType;
import AnimalSystem.src.main.java.org.system.transfer.Diet;

public abstract class Bird implements Animal, Predator {
    @Override
    public AnimalType getType() { return AnimalType.BIRD; }

    @Override
    public Diet getDiet() { return null; }
    public abstract void fly();
}
