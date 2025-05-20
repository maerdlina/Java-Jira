package AnimalSystem.src.main.java.org.system.roles;

//хищники

import AnimalSystem.src.main.java.org.system.transfer.Diet;

public interface Predator {
    default Diet getDiet() { return Diet.CARNIVORE; }
    void hunt();  // Уникальный метод для хищников
}
