package com.beyond.person.core.service.impl;

import com.beyond.person.core.enumaration.States;
import com.beyond.person.core.model.Singer;
import com.beyond.person.core.service.SingerActionService;

public class SingerActionServiceImpl implements SingerActionService {
    private Singer singer;
    private States states = States.NONE;
    private States states1 = States.NONE;

    /**
    *constructor for SingerImpl
     */
    public SingerActionServiceImpl(String name, String lastName) {
        singer = new Singer(name,lastName);
    }

    /**
     * override methods
     */
    @Override
    public void walk() {
        System.out.println(singer.getName() + " is walking ");
        states1 = States.WALKED;
    }

    /**
     * this method prints all methods in SingerActionServiceServiceImpl
     */
    @Override
    public void printAllMethods() {
        eat();
        learn();
        walk();
        singing();
    }

    /**
     * this method checks the statements and prints result
     */
    @Override
    public void playing() {
        if(states == States.EATEN && states1 == States.WALKED)
            System.out.println(singer.getName() + " is playing");
        else{
            if(states1 != States.WALKED) System.out.println(singer.getName() + " needs to walk for playing");
            else System.out.println(singer.getName() + " need to eat for playing");
        }
    }
    /**
     * this method checks the statements and prints result
     */
    @Override
    public void singing() {
        if(states == States.EATEN) {
            System.out.println(singer.getName() + " is singing");
        }else System.out.println(" not eaten that's why can't sing");

    }
    /**
     * this method checks the statements and prints result
     */
    @Override
    public void eat() {
        System.out.println(singer.getName() + " eats eggs");
        states = States.EATEN;
    }
    /**
     * this method checks the statements and prints result
     */
    @Override
    public void learn() {
        System.out.println(singer.getName() + " learned singing in " + singer.getBandName());
    }
}
