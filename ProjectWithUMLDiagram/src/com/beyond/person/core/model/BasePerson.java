package com.beyond.person.core.model;

import com.beyond.person.core.enums.Gender;
import com.beyond.person.core.exceptions.*;
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
            if (name.length() > 0 && name.length() < 255 && 0 < lastName.length() && lastName.length() < 255 && (Help.checkAlphabet(name)) && (Help.checkAlphabet(lastName))) {
                this.name = name;
                this.lastName = lastName;
            }else throw  new InvalidFieldException("Incorrect name or lastName");
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
            if (0 < designation.length() && designation.length() < 255)
                this.designation = designation;
            else throw new InvalidDesignationException("Incorrect type of designation");
    }

    public String getDesignation() {
        return designation;
    }

    public void setAge(String age) {
            if(Integer.parseInt(age) > 0 && Integer.parseInt(age) < 100)
                this.age = age;
            else throw new InvalidAgeException("Incorrect age");
    }


    public int getAge() {
        return Integer.parseInt(age);
    }

    public void setGender(String gender) {
        if(gender.equalsIgnoreCase(String.valueOf(Gender.FEMALE)) || gender.equalsIgnoreCase(String.valueOf(Gender.MALE)) )
                this.gender = gender;
            else throw new InvalidGenderException("Incorrect Gender");
        }


    public String  getGender() {
        return gender;
    }



    public void setEmail(String email) {
            if (Help.isEmailCorrect(email))
                this.email = email;
             else throw new InvalidEMailException("Incorrect email");
    }

    public String getEmail() {
        return email;
    }



    public void setNickName(String nickName) {
            if(0 < nickName.length() && nickName.length() < 255) {
                this.nickName = nickName;
            }
            else throw new InvalidNickNameException("Incorrect nickname");
    }


    public String getNickName() {
        return nickName;
    }
}
