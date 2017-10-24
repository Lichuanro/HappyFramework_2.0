package entity.animal.template;

import entity.animal.Animal;

public class Dog extends Animal {
    public Dog() {
        super();
    }

    @Override
    public void call() {
        print("Wang! Wang! Wang!");
    }

    @Override
    public void run() {
        print("Very fast.");
    }
}
