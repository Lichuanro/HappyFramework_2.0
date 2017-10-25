package entity.animal.template.skill;

import entity.animal.behavior.Skillable;

public class Sing extends Skill {
    public Sing(Skillable skill){
        super(skill);
    }
    @Override
    public void skill(){
        super.skill();
        print("Sing.");
    };
}
