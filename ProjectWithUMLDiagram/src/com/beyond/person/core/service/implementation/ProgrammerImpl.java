package com.beyond.person.core.service.implementation;

import com.beyond.person.core.enums.States;
import com.beyond.person.core.model.Programmer;
import com.beyond.person.core.service.interfaces.ProgrammerAction;

public class ProgrammerImpl implements ProgrammerAction {
    Programmer programmer;
    States states = States.NONE;

    @Override
    public void all() {
        eat();
        learn();
        walk();
        coding();
    }

    /**
     *constructor for ProgrammerImpl
     */
    public ProgrammerImpl(String name, String lastName, String companyName, String designation) {
        programmer = new Programmer(name,lastName, companyName, designation);
    }
    /**
     * overrides methods
     */
    @Override
    public void walk() {
        System.out.println(programmer.getName() + " is walking");
    }

    @Override
    public void coding() {
        if(states == States.LEARNT)
        System.out.println(programmer.getName() + " like coding");
        else System.out.println("cant code because not learned");
    }

    @Override
    public void eat() {
        System.out.println(programmer.getName() + " eats fast food");
        states = States.EATEN;


    }

    @Override
    public void learn() {
        if(states == States.EATEN)
        System.out.println(programmer.getName() + " learned at " + programmer.getCompanyName());
        else System.out.println("cant learn because nor eaten");
    }
}
