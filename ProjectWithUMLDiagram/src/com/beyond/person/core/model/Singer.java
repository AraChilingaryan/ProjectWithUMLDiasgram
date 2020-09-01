package com.beyond.person.core.model;

import com.beyond.person.core.enumaration.EngineerType;
import com.beyond.person.core.enumaration.SingerType;
import com.beyond.person.core.exception.ValidationException;

public class Singer extends BasePerson{
    private String bandName;
    private SingerType singerType;

    /**
     *constructor for Singer
     */
    public Singer(String name, String lastName) {
        super(name, lastName);
    }

    /**
     * setter for designation
     */

    public void setSingerType(int inputOfIndex)  {
        this.singerType = SingerType.getById(inputOfIndex);
    }
    public void setBandName(String bandName)  {
        this.bandName = bandName;
    }
    /**
     *getter for Singer
     */
    public String getBandName() {
        return bandName;
    }
    public String getSingerType(){ return singerType.toString();}

}
