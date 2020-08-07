package com.beyond.person.core.model;

import com.beyond.person.core.exceptoons.InvalidFieldException;
import com.beyond.person.core.helper.Help;

public class BasePerson {
    protected String name;
    protected String lastName;
    private String designation;

    /**
     * constructor for BasePerson
     *
     */
    public BasePerson(String name, String lastName){
        try {
            if (name.length() > 0 && name.length() < 255 && (Help.checkAlphabet(name)) && (Help.checkAlphabet(lastName))) {
                this.name = name;
                this.lastName = lastName;
            }else throw  new InvalidFieldException();
        } catch (InvalidFieldException e){
            e.getMessage();
        }
    }
    /**
     *
     getters and setters for BasePerson
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
