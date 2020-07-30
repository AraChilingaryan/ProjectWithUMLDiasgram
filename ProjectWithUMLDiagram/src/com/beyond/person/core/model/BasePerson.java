package com.beyond.person.core.model;

public class BasePerson {
    private String name;
    private String designation;

    /**
     * constructor for BasePerson
     *
     */
    public BasePerson(String name, String designation) {
        this.name = name;
        this.designation = designation;
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
