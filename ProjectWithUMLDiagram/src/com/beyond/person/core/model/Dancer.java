package com.beyond.person.core.model;

public class Dancer extends BasePerson{
    private String groupName;

    /**
     constructor for Dancer
     */
    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    /**
     * getter for Dancer
     */
    public String getGroupName() {
        return groupName;
    }


}
