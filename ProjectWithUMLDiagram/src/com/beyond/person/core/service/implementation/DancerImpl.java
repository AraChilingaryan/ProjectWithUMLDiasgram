package com.beyond.person.core.service.implementation;

import com.beyond.person.core.enums.States;
import com.beyond.person.core.exceptions.LimitException;
import com.beyond.person.core.model.Dancer;
import com.beyond.person.core.service.interfaces.DancerAction;

public class DancerImpl implements DancerAction {
    Dancer dancer;
    States states = States.NONE;
    int count = 0;

    /**
     * constructor for DancerImpl
     */
    public DancerImpl(String name, String lastName, String groupName, String designation) {
        dancer = new Dancer(name, lastName, groupName,designation);
    }

    /**
     * overrides methods
     */
    @Override
    public void dancing() {
        if(states == States.EATEN) {
            System.out.println(dancer.getName() + " is dancing");
        }else System.out.println("also have to eat " + (3 - count) + " times ");
    }

    @Override
    public void walk() {
        System.out.println(dancer.getName() + " is walking");
    }

    @Override
    public void eat() {
        System.out.println(dancer.getName() + " eats dietetic food because he dances " + dancer.getDesignation());
        count++;
        if(count == 3) states = States.EATEN;
        else if(count > 3){
            throw new LimitException(" you will be fat");
        }
    }

    @Override
    public void learn() {
        System.out.println(dancer.getName() + " learned dancing at " + dancer.getGroupName());
    }

    @Override
    public void all() {
        eat();
        learn();
        walk();
        dancing();
    }
}
