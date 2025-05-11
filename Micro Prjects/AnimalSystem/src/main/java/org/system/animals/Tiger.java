package org.system.animals;

import org.system.Animal;
import org.system.roles.Predator;
import org.system.subtype.CatLike;

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
