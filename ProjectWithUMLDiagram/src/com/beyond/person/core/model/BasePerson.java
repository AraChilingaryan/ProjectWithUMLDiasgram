package com.beyond.person.core.model;

import com.beyond.person.core.enums.Gender;
import com.beyond.person.core.exceptoons.*;
import com.beyond.person.core.helper.Help;

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
        try {
            if (name.length() > 0 && name.length() < 255 && (Help.checkAlphabet(name)) && (Help.checkAlphabet(lastName))) {
                this.name = name;
                this.lastName = lastName;
            }else throw  new InvalidFieldException();
        } catch (InvalidFieldException e){
            e.getMessage();
        }
    }
    /**
     *
     getters and setters for BasePerson
     */
    public String getName() {
        return name;
    }
    public String getLastName(){return lastName; }


    public void setDesignation(String designation) {
        try {
            if (0 < designation.length() && designation.length() < 255)
                this.designation = designation;
            else throw new InvalidDesignationException();
        }catch (InvalidDesignationException e){
            e.getMessage();
        }
    }

    public String getDesignation() {
        return designation;
    }

    public void setAge(String age) {
        try{
            if(Integer.parseInt(age) > 0 && Integer.parseInt(age) < 100) {
                this.age = age;
            }else throw new InvalidAgeException();
        }catch (InvalidAgeException e){
            e.getMessage();
        }
    }

    public int getAge() {
        return Integer.parseInt(age);
    }

    public void setGender(String gender) {
        try{
            if(gender.equalsIgnoreCase(String.valueOf(Gender.FEMALE)) || gender.equalsIgnoreCase(String.valueOf(Gender.MALE)) )
                this.gender = gender;
            else throw new InvalidGenderException();
        }catch (InvalidGenderException e){
            e.getMessage();
        }
    }

    public String  getGender() {
        return gender;
    }



    public void setEmail(String email) {
        try {
            if (Help.isEmailCorrect(email)){
                this.email = email;
            } else throw new InvalidEMailException();
        }catch(InvalidEMailException e){
            e.getMessage();
        }
    }

    public String getEmail() {
        return email;
    }



    public void setNickName(String nickName) {
        try {
            if(0 < nickName.length() && nickName.length() < 255) {
                this.nickName = nickName;
            }
            else throw new InvalidNickNameException();
        }catch (InvalidNickNameException e){
            e.getMessage();
        }
    }

    public String getNickName() {
        return nickName;
    }
}
