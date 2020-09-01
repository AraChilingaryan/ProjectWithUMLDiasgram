package com.beyond.person.core.model;

import com.beyond.person.core.enumaration.Designation;
import com.beyond.person.core.enumaration.Gender;
import com.beyond.person.core.exception.*;
import com.beyond.person.core.helper.AssistingMethods;

public class BasePerson {
    protected String name;
    protected String lastName;
    private   Designation designation;
    protected String age;
    protected String email;
    protected String nickName;
    protected Gender gender;
    public static int ID = 0;


    /**
     * constructor for BasePerson
     *
     */
    public BasePerson(String name, String lastName){
            if (AssistingMethods.isNameAndLastNameValid(name, lastName)) {
                this.name = name;
                this.lastName = lastName;
                ID++;
            }else throw  new ValidationException("input right name and lastName");
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
    public void setDesignation(int indexOfInput) {
       this.designation = Designation.getById(indexOfInput);
    }

    /**
     * getter for Designation
     */
    public Designation getDesignation() {
        return designation;
    }

    /**
     * setter for Age
     */
    public void setAge(String age) {
            if(Integer.parseInt(age) > 0 && Integer.parseInt(age) < 100)
                this.age = age;
            else throw new ValidationException("input age : from 1 to 99");
    }


    public int getAge() {
        return Integer.parseInt(age);
    }


    public void setGender(int numberOfIndex) {
        this.gender = Gender.getById(numberOfIndex);
    }


    public Gender  getGender() {
        return gender;
    }


    public void setEmail(String email) {
            if (AssistingMethods.isEmailValid(email))
                this.email = email;
             else throw new ValidationException("Input right Email");
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
            else throw new ValidationException("Input right NickName");
    }

    /**
     * getter for NickName
     */
    public String getNickName() {
        return nickName;
    }
    public int getId(){
        return ID;
    }
}
