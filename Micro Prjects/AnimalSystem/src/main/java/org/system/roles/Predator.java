package org.system.roles;

//хищники

import org.system.transfer.Diet;

public interface Predator {
    default Diet getDiet() { return Diet.CARNIVORE; }
    void hunt();  // Уникальный метод для хищников
}
