package com.beyond.person.core.model;

import com.beyond.person.core.enumaration.Gender;
import com.beyond.person.core.exceptions.*;
import com.beyond.person.core.helper.AssistingMethods;

public class BasePerson {
    protected String name;
    protected String lastName;
    protected String designation;
    protected String age;
    protected String gender;
    protected String email;
    protected String nickName;


    /**
     * constructor for BasePerson
     *
     */
    public BasePerson(String name, String lastName){
            if (AssistingMethods.isNameAndLastNameValid(name, lastName)) {
                this.name = name;
                this.lastName = lastName;
            }else throw  new ValidationException(new InvalidFieldException());
        }

    /**
     getters for Name and LastName
     */
    public String getName() {
        return name;
    }
    public String getLastName(){return lastName; }

    /**
     * setter for Designation
     */
    public void setDesignation(String designation) {
            if (0 < designation.length() && designation.length() < 255)
                this.designation = designation;
            else throw new ValidationException(new InvalidDesignationException());
    }

    /**
     * getter for Designation
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * setter for Age
     */
    public void setAge(String age) throws InvalidAgeException{
            if(Integer.parseInt(age) > 0 && Integer.parseInt(age) < 100)
                this.age = age;
            else throw new ValidationException(new InvalidAgeException());
    }

    /**
     * getter for Age
     */
    public int getAge() {
        return Integer.parseInt(age);
    }

    /**
     * setter for Gender
     */
    public void setGender(String gender) {
        if(gender.equalsIgnoreCase(String.valueOf(Gender.FEMALE)) || gender.equalsIgnoreCase(String.valueOf(Gender.MALE)) )
                this.gender = gender;
            else throw new ValidationException(new InvalidGenderException());
        }

    /**
     * getter for Gender
     */
    public String  getGender() {
        return gender;
    }


    /**
     * setter for Email
     */
    public void setEmail(String email) {
            if (AssistingMethods.isEmailValid(email))
                this.email = email;
             else throw new ValidationException(new InvalidEMailException());
    }

    /**
     * getter for Email
     */
    public String getEmail() {
        return email;
    }


    /**
     * setter for NickName
     */
    public void setNickName(String nickName) {
            if(0 < nickName.length() && nickName.length() < 255) {
                this.nickName = nickName;
            }
            else throw new ValidationException(new InvalidNickNameException());
    }

    /**
     * getter for NickName
     */
    public String getNickName() {
        return nickName;
    }
}
