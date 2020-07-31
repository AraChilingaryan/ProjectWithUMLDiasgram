package com.beyond.person.core.service.implementation;

import com.beyond.person.core.model.Singer;
import com.beyond.person.core.service.interfaces.SingerAction;

public class SingerImpl implements SingerAction {
    Singer singer;

    /**
    *constructor
     */
    public SingerImpl(String name,String destination, String bandName) {
        singer = new Singer(name, destination, bandName);
    }

    @Override
    public void singing() {
        System.out.println(singer.getName() + " is singing");

    }

    @Override
    public void eat() {
        System.out.println(singer.getName() + " eats eggs");

    }

    @Override
    public void learn() {
        System.out.println(singer.getName() + " learned singing at " + singer.getBandName());
    }
}
