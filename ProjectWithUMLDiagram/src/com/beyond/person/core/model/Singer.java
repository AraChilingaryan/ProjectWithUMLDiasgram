package com.beyond.person.core.model;

import com.beyond.person.core.enums.SingerType;
import com.beyond.person.core.exceptions.InvalidDesignationException;

public class Singer extends BasePerson{
    private String bandName;
    protected String singerType;

    /**
     *constructor for Singer
     */
    public Singer(String name, String lastName, String bandName, String designation) {
        super(name, lastName);
        this.bandName = bandName;
        this.designation = designation;
    }

    /**
     * setter for designation
     */
    public void setDesignation(String designation)  {
        if(designation.equalsIgnoreCase(String.valueOf(SingerType.JAZZ)) || designation.equalsIgnoreCase(String.valueOf(SingerType.POP))
                || designation.equalsIgnoreCase(String.valueOf(SingerType.ROCK)))
            this.designation = designation;
        else
            throw new InvalidDesignationException("Incorrect type of singer");
        }
    /**
     *getter for Singer
     */
    public String getBandName() {
        return bandName;
    }
    public String getSingerType(){ return singerType;}

}
