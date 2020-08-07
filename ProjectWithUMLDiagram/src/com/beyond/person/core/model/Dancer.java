package com.beyond.person.core.model;

import com.beyond.person.core.enums.DancerType;
import com.beyond.person.core.enums.EngineerType;
import com.sun.jdi.InvalidTypeException;

public class Dancer extends BasePerson{
    private String groupName;
    private String danceType;

    /**
     constructor for Dancer
     */
    public Dancer(String name, String lastName,String designation, String groupName) {
        super(name, lastName);
        this.designation = designation;
        this.groupName = groupName;
    }

    public void setDesignation(String designation){
        if(designation.equalsIgnoreCase(String.valueOf(DancerType.CONTEMPORARY)) || designation.equalsIgnoreCase(String.valueOf(DancerType.LATINO))
                || designation.equalsIgnoreCase(String.valueOf(DancerType.TRADITIONAL_ARMENIAN)))
            this.designation = designation;
        else try {
            throw new InvalidTypeException();
        } catch (InvalidTypeException e) {
            e.printStackTrace();
        }
    }

    /**
     * getter for Dancer
     */
    public String getGroupName() {
        return groupName;
    }
    public String getDanceType(){return danceType;}


}
