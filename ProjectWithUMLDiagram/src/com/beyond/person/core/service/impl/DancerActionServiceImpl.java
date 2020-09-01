package com.beyond.person.core.service.impl;

import com.beyond.person.core.enumaration.States;
import com.beyond.person.core.exception.LimitException;
import com.beyond.person.core.exception.ValidationException;
import com.beyond.person.core.model.Dancer;
import com.beyond.person.core.service.DancerActionService;

public class DancerActionServiceImpl implements DancerActionService {
    private Dancer dancer;
    private States states = States.NONE;
    private int count = 0;

    /**
     * constructor for DancerImpl
     */
    public DancerActionServiceImpl(String name, String lastName) {
        dancer = new Dancer(name, lastName);
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

    /**
     * this method checks the statements and prints result
     */

    @Override
    public void walk() {
        System.out.println(dancer.getName() + " is walking");
    }

    /**
     * this method checks the statements and prints result
     */
    @Override
    public void eat() {
        System.out.println(dancer.getName() + " eats dietetic food because he dances " + dancer.getDesignation());
        count++;
        if(count == 3) states = States.EATEN;
        else if(count > 3){
            throw new LimitException("You can't eat anymore");
        }
    }

    /**
     * this method checks the statements and prints result
     */
    @Override
    public void learn() {
        System.out.println(dancer.getName() + " learned dancing at " + dancer.getGroupName());
    }

    /**
     * this method prints all methods in DancerActionServiceServiceImpl
     */
    @Override
    public void printAllMethods() {
        eat();
        learn();
        walk();
        dancing();
    }
}
