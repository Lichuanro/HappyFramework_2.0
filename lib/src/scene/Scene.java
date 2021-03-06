package scene;

import application.Printable;
import entity.Entity;

import java.util.Collection;
import java.util.HashMap;

public abstract class Scene implements Printable, Actionable {

    private String sceneName;
    private HashMap<String, Entity> children;
    private static long id = 0;

    protected Scene() {

        sceneName = "Default";
    }

    protected Scene(String name) {
        sceneName = name;

    }

    @Override
    public void action() {

    }

    public String addChild(Entity entity) {
        String key = entity.getClass().toString() + " " +id++;
        children.put("" + key, entity);
        return key;
    }

    public Entity removeChild(String key) {
        return children.remove(key);
    }

    public Collection<Entity> getAllChildren() {
        return children.values();
    }
    public void clearChildren() {
        children.clear();
    }

}
