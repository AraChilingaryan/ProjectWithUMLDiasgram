package com.beyond.person.core.helper;

import com.beyond.person.core.exceptions.InvalidDesignationException;
import com.beyond.person.core.model.BasePerson;
import com.beyond.person.core.model.Dancer;
import com.beyond.person.core.model.Programmer;
import com.beyond.person.core.model.Singer;
import com.beyond.person.core.service.factory.PersonFactory;
import com.beyond.person.core.service.implementation.DancerImpl;
import com.beyond.person.core.service.implementation.ProgrammerImpl;
import com.beyond.person.core.service.implementation.SingerImpl;

import java.util.Scanner;

public class UserInputArguments {
    Scanner scanner = new Scanner(System.in);
    public void userInputs(int choice, String name, String lastName, String designation){
        switch(choice){
            case 1:
                System.out.println("write groupName");
                String groupName = scanner.nextLine();
                BasePerson dancer = new Dancer(name, lastName,designation,groupName);
                try{
                    dancer.setDesignation(designation);
                }catch(InvalidDesignationException e){
                    System.out.println(e.getMessage());
                }
                DancerImpl dancerImpl = (DancerImpl) PersonFactory.getPersonType(dancer);
                dancerImpl.all();

                break;
            case 2:
                System.out.println("write bandName");
                String bandName = scanner.nextLine();
                BasePerson singer = new Singer(name, lastName, bandName, designation);
                try{
                    singer.setDesignation(designation);
                }catch(InvalidDesignationException e){
                    System.out.println(e.getMessage());
                }
                SingerImpl singerImpl = (SingerImpl)PersonFactory.getPersonType(singer);
                singerImpl.all();
                break;
            case 3:
                System.out.println("write companyName");
                String companyName = scanner.nextLine();
                BasePerson programmer = new Programmer(name, lastName, companyName, designation);
                try{
                    programmer.setDesignation(designation);
                }catch(InvalidDesignationException e){
                    System.out.println(e.getMessage());
                }

                ProgrammerImpl programmerImpl = (ProgrammerImpl) PersonFactory.getPersonType(programmer);
                programmerImpl.all();
                break;
        }

    }
}
