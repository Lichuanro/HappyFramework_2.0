package entity.group;


import entity.Entity;

import java.util.ArrayList;
import java.util.Collection;

public class Group<T extends Entity> extends Entity {

    protected T entity;
    protected int count;

    Group(T entity, int count) {
        if (count < 0) {
            count = 0;
        }
        this.count = count;
        this.entity = entity;
    }

    /**
     * get the whole group
     * @return Collection of class T contains all the entities
     */
    public Collection<T> getGroup() {

        return this.getGroup(this.count);
    }

    /**
     * get the specific number entities of the group
     * @param num
     * @return
     */
    @SuppressWarnings(value = {"unchecked"})
    public Collection<T> getGroup(int num) {
        Collection<T> list = new ArrayList<>();
        if (num >= this.count) {
            num = this.count;
        }
        for (int i = 0; i < num; ++i) {

            list.add((T) entity.clone());
        }
        return list;
    }

    /**
     * get the class name of the group entity
     * @return the class name
     */
    public String getEntityName() {
        return this.entity.getClass().toString();
    }

    /**
     * get the size of the group
     * @return size
     */
    public int getGroupSize() {
        return this.count;
    }

    /**
     * set or reset the size of group
     * @param count
     */
    public void setGroupSize(int count) {
        if (count > 0) {
            this.count = count;
        }
    }
}


