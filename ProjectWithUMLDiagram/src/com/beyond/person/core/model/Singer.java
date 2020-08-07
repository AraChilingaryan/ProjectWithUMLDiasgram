package com.beyond.person.core.model;

import com.beyond.person.core.enums.DancerType;
import com.beyond.person.core.enums.SingerType;
import com.sun.jdi.InvalidTypeException;

public class Singer extends BasePerson{
    private String bandName;
    protected String singerType;

    /**
     *constructor for Singer
     */
    public Singer(String name, String lastName,String designation, String bandName) {
        super(name, lastName);
        this.bandName = bandName;
        this.designation = designation;
    }

    public void setDesignation(String designation){
        if(designation.equalsIgnoreCase(String.valueOf(SingerType.JAZZ)) || designation.equalsIgnoreCase(String.valueOf(SingerType.POP))
                || designation.equalsIgnoreCase(String.valueOf(SingerType.ROCK)))
            this.designation = designation;
        else try {
            throw new InvalidTypeException();
        } catch (InvalidTypeException e) {
            e.printStackTrace();
        }
    }
    /**
     *getter for Singer
     */
    public String getBandName() {
        return bandName;
    }
    public String getSIngerType(){ return singerType;}

}
