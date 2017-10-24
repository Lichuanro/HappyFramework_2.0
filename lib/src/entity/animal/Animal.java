package entity.animal;

import entity.Entity;
import entity.animal.behavior.AnimalBehavior;

public abstract class Animal extends Entity implements AnimalBehavior {

    protected Animal() {
        super();
    }
}
