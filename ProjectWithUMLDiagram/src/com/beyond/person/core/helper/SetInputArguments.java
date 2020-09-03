package com.beyond.person.core.helper;


import com.beyond.person.core.exception.InvalidTypeException;
import com.beyond.person.core.exception.ValidationException;
import com.beyond.person.core.model.BasePerson;

import java.util.Scanner;

public class SetInputArguments{
    private BasePerson person;
    private int count = 0;

    public SetInputArguments(BasePerson person) {
        this.person = person;
    }

    private void setArgument(int number, int choice){
        Scanner scanner = new Scanner(System.in);
        switch (number){
                    case 0:
                        try {
                            person.setDesignation(choice);
                        }catch (ValidationException e){
                            e.getMessage();
                        }
                        break;
                    case 1 :
                        System.out.println("input age :");
                        try {
                            person.setAge(scanner.nextLine());
                        }catch (ValidationException e){
                            e.getMessage();
                        }

                        break;
                    case 2:
                        System.out.println("input Gender : 1) MALE 2) FEMALE");
                        try {
                            person.setGender(Integer.parseInt(scanner.nextLine()));
                        }catch (InvalidTypeException e){
                            e.getMessage();
                        }
                        break;
                    case 3:
                        System.out.println("input email :");
                        try {
                            person.setEmail(scanner.nextLine());
                        }catch (ValidationException e){
                            e.getMessage();
                        }
                        break;
                    case 4:
                        System.out.println("input NickName");
                        try {
                            person.setNickName(scanner.nextLine());
                        }catch (ValidationException e){
                            e.getMessage();
                        }
                        break;
        }
    }

    public BasePerson setPerson(int choice){
    for (int i = count;i <= 4 ; i++) {
            try {
                setArgument(i,choice);
                count++;
                if(count == 5)break;
            }catch (ValidationException e) {
                    e.getMessage();
            }
      }
       return person;
    }
}