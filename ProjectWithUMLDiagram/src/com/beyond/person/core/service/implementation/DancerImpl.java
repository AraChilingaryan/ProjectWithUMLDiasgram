package com.beyond.person.core.service.implementation;

import com.beyond.person.core.model.Dancer;
import com.beyond.person.core.service.interfaces.DancerAction;

public class DancerImpl implements DancerAction {
    Dancer dancer;

    public DancerImpl(String name, String destination, String groupName) {
        dancer = new Dancer(name, destination, groupName);
    }

    @Override
    public void dancing() {
        System.out.println(dancer.getName() + " is dancing");
    }

    @Override
    public void eat() {
        System.out.println(dancer.getName() + " eats dietetic food");
    }

    @Override
    public void learn() {
        System.out.println(dancer.getName() + " learned dancing at " + dancer.getGroupName());
    }
}
