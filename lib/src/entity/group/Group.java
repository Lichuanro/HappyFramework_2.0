package entity.group;


import entity.Entity;

import java.util.ArrayList;
import java.util.Collection;

public class Group<T extends Entity> extends Entity {

    protected T entity;
    protected int count;

    Group(T entity, int count) {
        this.count = count;
        this.entity = entity;
    }


    @SuppressWarnings(value = {"unchecked"})
    public Collection<T> getGroup() {
        Collection<T> list = new ArrayList<>();
        for (int i = 0; i < count; ++i) {

            list.add((T) entity.clone());
        }
        return list;
    }

}


