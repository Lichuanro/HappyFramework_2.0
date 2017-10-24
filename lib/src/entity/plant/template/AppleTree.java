package entity.plant.template;

import entity.plant.Plant;
import entity.plant.PlantProduct;

public class AppleTree extends Plant {

    public AppleTree() {
        super();
    }

    @Override
    public void grow() {
        print("I am growing... I grew up");
    }


    @Override
    public void yield() {
        print("I have many apples now!");

    }

    public class Apple extends PlantProduct {

    }

}
