package entity.group;

import entity.animal.Animal;
import entity.animal.behavior.AnimalBehavior;

class AnimalGroup<T extends Animal> extends Group<T> implements AnimalBehavior {
    public AnimalGroup(T t, int number) {
        super(t, number);
    }


    @Override
    public void speak() {
        print("" + super.count + " times echoed the voice: see next line");
        entity.speak();
    }

    @Override
    public void move() {
        print("" + super.count + " bodies are moving together: see next line");
        entity.move();
    }
}