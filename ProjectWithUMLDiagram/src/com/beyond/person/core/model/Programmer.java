package com.beyond.person.core.model;

public class Programmer extends BasePerson{
    private String companyName;


    /**
     * constructor for programmer
     */
    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    /**
     *getter for Programmer
     */
    public String getCompanyName() {
        return companyName;
    }
}
