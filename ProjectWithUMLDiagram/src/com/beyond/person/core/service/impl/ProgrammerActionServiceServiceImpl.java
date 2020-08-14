package com.beyond.person.core.service.impl;

import com.beyond.person.core.enumaration.States;
import com.beyond.person.core.model.Programmer;
import com.beyond.person.core.service.ProgrammerActionServiceService;

public class ProgrammerActionServiceServiceImpl implements ProgrammerActionServiceService {
    Programmer programmer;
    States states = States.NONE;

    /**
     * this method prints all methods in ProgrammerActionServiceServiceImpl
     */
    @Override
    public void printAllMethods() {
        eat();
        learn();
        walk();
        coding();
    }

    /**
     *constructor for ProgrammerImpl
     */
    public ProgrammerActionServiceServiceImpl(String name, String lastName, String companyName, String designation) {
        programmer = new Programmer(name,lastName, companyName, designation);
    }

    /**
     * this method checks the statements and prints result
     */

    @Override
    public void walk() {
        System.out.println(programmer.getName() + " is walking");
    }

    /**
     * this method checks the statements and prints result
     */

    @Override
    public void coding() {
        if(states == States.LEARNT)
        System.out.println(programmer.getName() + " like coding");
        else System.out.println("cant code because not learned");
    }

    /**
     * this method checks the statements and prints result
     */
    @Override
    public void eat() {
        System.out.println(programmer.getName() + " eats fast food");
        states = States.EATEN;

    }

    /**
     * this method checks the statements and prints result
     */
    @Override
    public void learn() {
        if(states == States.EATEN)
        System.out.println(programmer.getName() + " learned at " + programmer.getCompanyName());
        else System.out.println("cant learn because nor eaten");
    }
}
