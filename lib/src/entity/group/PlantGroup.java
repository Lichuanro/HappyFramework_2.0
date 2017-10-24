package entity.group;

import entity.plant.Plant;
import entity.plant.behavior.PlantBehavior;

class PlantGroup<T extends Plant> extends Group<T> implements PlantBehavior {
    public PlantGroup(T t, int number) {
        super(t, number);
    }

    @Override
    public void grow() {
        entity.grow();
    }

    @Override
    public void yield() {
        entity.yield();
    }
}