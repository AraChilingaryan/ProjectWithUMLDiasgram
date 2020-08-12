package com.beyond.person.entrypoint;

import com.beyond.person.core.exceptions.*;
import com.beyond.person.core.helper.UserInputArguments;
import com.beyond.person.core.model.BasePerson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        BasePerson person;

        Scanner scanner = new Scanner(System.in);
        while (count < 3) {
            System.out.println("what kind of person do you want to create 1)Dancer, 2) SInger, 3)Programmer");
            String input = scanner.nextLine();
            int choice = Integer.parseInt(input);
            try {
                if (!("1".equals(input)) && !("2".equals(input)) && !("3".equals(input))) {
                    count++;
                    throw new PersonNotFound("Person not supported");
                }
            } catch (PersonNotFound e) {
                System.out.println(e.getMessage());
                continue;
            }

            System.out.println("name :");
            String name = scanner.nextLine();
            System.out.println("lastName :");
            String lastName = scanner.nextLine();
            try {
                person = new BasePerson(name, lastName);
            }catch(InvalidFieldException e){
                System.out.println(e.getMessage());
                continue;
            }
            System.out.println("designation :");
            String designation = scanner.nextLine();
            System.out.println("age :");
            String age = scanner.nextLine();
            System.out.println("email :");
            String email = scanner.nextLine();
            System.out.println("nickName :");
            String nickName = scanner.nextLine();

                try {
                    person.setNickName(nickName);
                } catch (InvalidNickNameException e) {
                    System.out.println(e.getMessage());
                    continue;
                }
                try {
                    person.setAge(age);
                } catch (InvalidAgeException e) {
                    System.out.println(e.getMessage());
                    continue;

                }
                try {
                    person.setEmail(email);
                } catch (InvalidEMailException e) {
                    System.out.println(e.getMessage());
                    continue;
                }

            UserInputArguments userInputArguments = new UserInputArguments();
            userInputArguments.userInputs(choice, name, lastName, designation);

        }
    }
}
