package com.beyond.person.core.helper;

import com.beyond.person.core.exceptions.ValidationException;
import com.beyond.person.core.model.BasePerson;
import com.beyond.person.core.model.Dancer;
import com.beyond.person.core.model.Programmer;
import com.beyond.person.core.model.Singer;
import com.beyond.person.core.service.factory.PersonFactory;
import com.beyond.person.core.service.impl.DancerActionServiceImpl;
import com.beyond.person.core.service.impl.ProgrammerActionServiceImpl;
import com.beyond.person.core.service.impl.SingerActionServiceImpl;

import java.util.Scanner;

public class UserInputArguments {
    Scanner scanner = new Scanner(System.in);
    private PersonFactory personFactory;

    public void userInputs(int choice, String name, String lastName, String designation){
        switch(choice){
            case 1:
                System.out.println("write groupName");
                String groupName = scanner.nextLine();
                BasePerson dancer = new Dancer(name, lastName,designation,groupName);
                try{
                    dancer.setDesignation(designation);
                }catch(ValidationException e){
                    e.getInfo();
                }
                personFactory = new PersonFactory();
                DancerActionServiceImpl dancerActionServiceImpl = (DancerActionServiceImpl) personFactory.getPersonType(dancer);
                dancerActionServiceImpl.printAllMethods();

                break;
            case 2:
                System.out.println("write bandName");
                String bandName = scanner.nextLine();
                BasePerson singer = new Singer(name, lastName, bandName, designation);
                try{
                    singer.setDesignation(designation);
                }catch(ValidationException e){
                    e.getInfo();
                }

                personFactory = new PersonFactory();
                SingerActionServiceImpl singerActionServiceImpl = (SingerActionServiceImpl)personFactory.getPersonType(singer);
                singerActionServiceImpl.printAllMethods();
                break;
            case 3:
                System.out.println("write companyName");
                String companyName = scanner.nextLine();
                BasePerson programmer = new Programmer(name, lastName, companyName, designation);
                try{
                    programmer.setDesignation(designation);
                }catch(ValidationException e){
                    e.getInfo();
                }
                personFactory = new PersonFactory();
                ProgrammerActionServiceImpl programmerActionServiceImpl = (ProgrammerActionServiceImpl) personFactory.getPersonType(programmer);
                programmerActionServiceImpl.printAllMethods();
                break;
        }

    }
}
