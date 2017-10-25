package entity.animal.template.skill;

import entity.animal.behavior.Skillable;

public class Coding extends Skill{
    public Coding(Skillable skill) {

        super(skill);

    }

    @Override
    public void skill() {
        super.skill();
        print("Code.");

    }
}
