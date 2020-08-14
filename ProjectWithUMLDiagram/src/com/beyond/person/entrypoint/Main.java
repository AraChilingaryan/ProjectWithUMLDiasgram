package com.beyond.person.entrypoint;

import com.beyond.person.core.exceptions.*;
import com.beyond.person.core.helper.SetInputArguments;
import com.beyond.person.core.helper.UserInputArguments;
import com.beyond.person.core.model.BasePerson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        BasePerson person;
        String input  = "";

            Scanner scanner = new Scanner(System.in);
            System.out.println("what kind of person do you want to create 1)Dancer, 2) SInger, 3)Programmer");
            while(count < 3) {
                try {
                   input = scanner.nextLine();
                    int choice = Integer.parseInt(input);
                    if (choice == 1 || choice == 2 || choice == 3) {
                        SetInputArguments setInputArguments = new SetInputArguments();
                        person = setInputArguments.inputAndSetArguments();
                        UserInputArguments userInputArguments = new UserInputArguments();
                        userInputArguments.userInputs(choice, person.getName(), person.getLastName(), setInputArguments.getDesignation());
                    } else {
                        count++;
                        System.out.println("input one more time :");
                        if (count == 3) {
                            throw new ValidationException(new PersonNotSupportedException());
                        }
                    }
                } catch (ValidationException e) {
                    e.getInfo();
                }
            }
    }
}

