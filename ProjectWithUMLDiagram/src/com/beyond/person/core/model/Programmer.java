package com.beyond.person.core.model;

import com.beyond.person.core.enumaration.EngineerType;
import com.beyond.person.core.exceptions.InvalidDesignationException;
import com.beyond.person.core.exceptions.ValidationException;

public class Programmer extends BasePerson{
    private String companyName;
    private String engineerType;


    /**
     * constructor for programmer
     */
    public Programmer(String name,String lastName, String companyName, String designation) {
        super(name, lastName);
        this.companyName = companyName;
        this.designation = designation;
    }

    /**
     * setter for designation
     */
    public void setDesignation(String designation)  {
        if (designation.equalsIgnoreCase(String.valueOf(EngineerType.DATA)) || designation.equalsIgnoreCase(String.valueOf(EngineerType.SOFTWARE))
                || designation.equalsIgnoreCase(String.valueOf(EngineerType.HARDWARE)))
            this.designation = designation;
        else {
            throw new ValidationException(new InvalidDesignationException());
        }
    }

    /**
     *getter for Programmer
     */


    public String getCompanyName() {
        return companyName;
    }
    public String getEngineerType(){
        return engineerType;
    }
}
