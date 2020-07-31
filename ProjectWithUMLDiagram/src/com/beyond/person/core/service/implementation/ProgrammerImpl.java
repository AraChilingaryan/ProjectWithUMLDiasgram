package com.beyond.person.core.service.implementation;

import com.beyond.person.core.model.Programmer;
import com.beyond.person.core.service.interfaces.ProgrammerAction;

public class ProgrammerImpl implements ProgrammerAction {
    Programmer programmer;

    public ProgrammerImpl(String name, String destination, String companyName) {
        programmer = new Programmer(name, destination, companyName);
    }

    @Override
    public void coding() {
        System.out.println(programmer.getName() + " like coding");

    }

    @Override
    public void eat() {
        System.out.println(programmer.getName() + " eats fast food");

    }

    @Override
    public void learn() {
        System.out.println(programmer.getName() + " learned at " + programmer.getCompanyName());

    }
}
