package entity.animal.template.skill;

import entity.Entity;
import entity.animal.behavior.Skillable;

public class Skill extends Entity implements Skillable{
    public Skill(Skillable skill){
        this.skill = skill;

    }
    @Override
    public void skill(){
        skill.skill();
    }

    private Skillable skill;
}
