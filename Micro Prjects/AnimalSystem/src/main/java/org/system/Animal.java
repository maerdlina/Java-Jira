package org.system;

import org.system.transfer.AnimalType;
import org.system.transfer.Diet;

public interface Animal {
    String getName(String name);
    AnimalType getType();  // Млекопитающее, птица и т.д. (enum)
    Diet getDiet();
}
