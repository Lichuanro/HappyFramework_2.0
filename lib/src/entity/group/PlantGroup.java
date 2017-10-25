package entity.group;

import entity.plant.Plant;
import entity.plant.behavior.PlantBehavior;

class PlantGroup<T extends Plant> extends Group<T> implements PlantBehavior {
    public PlantGroup(T t, int number) {
        super(t, number);
    }

    @Override
    public void grow() {
        print("" + super.count + " grow together: see next line");
        entity.grow();
    }

    @Override
    public void yield() {
        print("" + super.count + " yield together: see next line");
        entity.yield();
    }
}