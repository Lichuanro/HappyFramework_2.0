import application.SampleApplication;
import entity.animal.behavior.Skillable;
import entity.animal.template.Dog;
import entity.animal.template.Human;
import entity.animal.template.skill.Coding;
import entity.animal.template.skill.Dance;
import entity.animal.template.skill.Sing;
import entity.animal.template.skill.Skill;

public class Main {
    public static void main(String[] args) {
        SampleApplication application = new SampleApplication();
        application.start();
        application.end();
        Skillable[] array = {new Sing(new Human()), new Dance(new Sing(new Human())),
                new Coding(new Dance(new Sing(new Human())))};
        for (Skillable anArray : array) {
            anArray.skill();
        }

    }

}
