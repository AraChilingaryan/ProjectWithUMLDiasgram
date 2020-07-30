package com.beyond.person.core.model;

public class Singer extends BasePerson{
    private String bandName;

    /**
     *constructor for Singer
     */
    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    /**
     *getter for Singer
     */
    public String getBandName() {
        return bandName;
    }

}
