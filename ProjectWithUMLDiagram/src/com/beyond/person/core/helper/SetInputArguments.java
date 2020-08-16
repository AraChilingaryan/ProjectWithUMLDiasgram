package com.beyond.person.core.helper;

import com.beyond.person.core.exceptions.*;
import com.beyond.person.core.model.BasePerson;

import java.util.Scanner;

public class SetInputArguments  {
    private int choice;
    private int count = 0;
    private  int count1 = 0;
    public  BasePerson person;
    private String designation;

    /**
    constructor for SetInputArguments
     */
    public SetInputArguments(){

    }


    public BasePerson inputAndSetArguments() {
        Scanner scanner = new Scanner(System.in);
        while (count < 3) {
            System.out.println("name :");
            String name = scanner.nextLine();
            System.out.println("lastName :");
            String lastName = scanner.nextLine();
            try {
                person = new BasePerson(name, lastName);
            } catch (ValidationException e) {
                e.getInfo();
                count++;
                continue;
            }
            System.out.println("designation :");
            designation = scanner.nextLine();
            System.out.println("age :");
            String age = scanner.nextLine();
            try {
                person.setAge(age);
            } catch (ValidationException e) {
                e.getInfo();
                count++;
                continue;

            }
            System.out.println("email :");
            String email = scanner.nextLine();
            try {
                person.setEmail(email);
            } catch (ValidationException e) {
                e.getInfo();
                count++;
                continue;
            }
            System.out.println("nickName :");
            String nickName = scanner.nextLine();
            try {
                person.setNickName(nickName);
            } catch (ValidationException e) {
                e.getInfo();
                count++;
                continue;
            }
            count1++;
            if(count1 == 1) break;
            else try{
              if(count1 == 3)
                 throw new ValidationException(new PersonNotSupportedException());
            }catch (ValidationException e){
            e.getInfo();
            }
        }

        return person;
    }

    public String getDesignation(){
        return this.designation;
    }
}
