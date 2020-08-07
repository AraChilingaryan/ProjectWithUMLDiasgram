package com.beyond.person.core.model;

import com.beyond.person.core.enums.EngineerType;
import com.sun.jdi.InvalidTypeException;

public class Programmer extends BasePerson{
    private String companyName;
    private String engineerType;


    /**
     * constructor for programmer
     */
    public Programmer(String name,String lastName, String designation, String companyName) {
        super(name, lastName);
        this.companyName = companyName;
        this.designation = designation;
    }


    public void setDesignation(String designation){
        if(designation.equalsIgnoreCase(String.valueOf(EngineerType.DATA)) || designation.equalsIgnoreCase(String.valueOf(EngineerType.SOFTWARE))
        || designation.equalsIgnoreCase(String.valueOf(EngineerType.HARDWARE)))
            this.designation = designation;
        else try {
            throw new InvalidTypeException();
        } catch (InvalidTypeException e) {
            e.printStackTrace();
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
