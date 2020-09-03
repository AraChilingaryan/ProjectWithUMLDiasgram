package com.beyond.person.core.model;

import com.beyond.person.core.enumaration.EngineerType;
import com.beyond.person.core.exception.ValidationException;

public class Programmer extends BasePerson{
    private String companyName;
    private EngineerType engineerType;


    /**
     * constructor for programmer
     */
    public Programmer(String name,String lastName) {
        super(name, lastName);
    }

    /**
     * setter for designation
     */
    public void setProgrammerType(int inputOfIndex)  {
            this.engineerType = EngineerType.getById(inputOfIndex);
    }

    public void setCompanyName(String companyName)  {
        this.companyName = companyName;
    }

    /**
     *getter for Programmer
     */


    public String getCompanyName() {
        return companyName;
    }
    public String getEngineerType(){
        return engineerType.toString();
    }
}
