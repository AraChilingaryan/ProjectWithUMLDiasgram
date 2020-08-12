package com.beyond.person.core.service.implementation;

import com.beyond.person.core.enums.States;
import com.beyond.person.core.model.Singer;
import com.beyond.person.core.service.interfaces.SingerAction;

public class SingerImpl implements SingerAction {
    Singer singer;
    States states = States.NONE;
    States states1 = States.NONE;

    /**
    *constructor for SingerImpl
     */
    public SingerImpl(String name,String lastName, String bandName, String designation) {
        singer = new Singer(name,lastName, bandName, designation);
    }

    /**
     * override methods
     */
    @Override
    public void walk() {
        System.out.println(singer.getName() + " is walking ");
        states1 = States.WALKED;
    }

    @Override
    public void all() {
        eat();
        learn();
        walk();
        singing();
    }

    @Override
    public void playing() {
        if(states == States.EATEN && states1 == States.WALKED)
            System.out.println(singer.getName() + " is playing");
        else{
            if(states1 != States.WALKED) System.out.println(singer.getName() + " needs to walk for playing");
            else System.out.println(singer.getName() + " need to eat for playing");
        }
    }

    @Override
    public void singing() {
        if(states == States.EATEN) {
            System.out.println(singer.getName() + " is singing");
        }else System.out.println(" not eaten that's why can't sing");

    }

    @Override
    public void eat() {
        System.out.println(singer.getName() + " eats eggs");
        states = States.EATEN;
    }

    @Override
    public void learn() {
        System.out.println(singer.getName() + " learned singing in " + singer.getBandName());
    }
}
