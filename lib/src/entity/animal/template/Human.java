package entity.animal.template;

import entity.Entity;
import entity.animal.behavior.AnimalBehavior;
import entity.animal.behavior.Skillable;

public class Human extends Entity implements Skillable{
    public Human() {
        super();
    }

    protected Human(String name) {
        super(name);
    }

    @Override
    public void skill(){print("Unskilled");}
}
