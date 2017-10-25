package entity.animal.template.skill;

import entity.animal.behavior.Skillable;

public class Dance extends Skill{
    public Dance(Skillable skill) {

        super(skill);

    }

    @Override
    public void skill() {
        super.skill();
        print("Dance.");

    }
}
