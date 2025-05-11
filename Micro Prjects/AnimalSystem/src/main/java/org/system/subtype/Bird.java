package org.system.subtype;

import org.system.Animal;
import org.system.roles.Predator;
import org.system.transfer.AnimalType;
import org.system.transfer.Diet;

public abstract class Bird implements Animal, Predator {
    @Override
    public AnimalType getType() { return AnimalType.BIRD; }

    @Override
    public Diet getDiet() { return null; }
    public abstract void fly();
}
