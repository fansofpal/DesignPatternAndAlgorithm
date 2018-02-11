package com.hdw.component;

import java.util.List;

/**
 * user:hudawei1
 * date:2018/2/11
 * time:16:52
 */
public abstract class Component {

    protected String name;

    public Component(String name){
        this.name = name;
    }

    protected abstract Component add(Component component);

    protected abstract void del(String name);

    protected abstract List<Component> display();



}
