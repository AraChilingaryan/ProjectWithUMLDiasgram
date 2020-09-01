package com.beyond.person.core.model;

import com.beyond.person.core.enumaration.DancerType;
import com.beyond.person.core.exception.ValidationException;

public class Dancer extends BasePerson{
    private String groupName;
    private DancerType dancerType;

    /**
     constructor for Dancer
     */
    public Dancer(String name, String lastName) {
        super(name, lastName);
    }

    public void setDancerType(int indexOfInput)  {
        this.dancerType = DancerType.getById(indexOfInput);
    }

    public void setGroupName(String groupName)  {
        this.groupName = groupName;
    }

    /**
     * getter for Dancer
     */
    public String getGroupName() {
        return groupName;
    }
    public String getDanceType(){return dancerType.toString();}


}
