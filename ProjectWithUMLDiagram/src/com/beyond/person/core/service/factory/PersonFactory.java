package com.beyond.person.core.service.factory;

import com.beyond.person.core.exception.InvalidTypeException;
import com.beyond.person.core.exception.NotFoundException;
import com.beyond.person.core.exception.ValidationException;
import com.beyond.person.core.model.BasePerson;
import com.beyond.person.core.model.Dancer;
import com.beyond.person.core.model.Programmer;
import com.beyond.person.core.model.Singer;
import com.beyond.person.core.service.impl.DancerActionServiceImpl;
import com.beyond.person.core.service.impl.ProgrammerActionServiceImpl;
import com.beyond.person.core.service.impl.SingerActionServiceImpl;
import com.beyond.person.core.service.BasePersonActionService;

import java.util.Scanner;

public class PersonFactory {
    private BasePersonActionService basePersonActionServiceImpl;


    /**
     * method for generating person of a type,tou should use it
     * if yor want to call methods for our person
     */
    public BasePersonActionService getPersonType(BasePerson person) {
            if (person instanceof Dancer) {
                Dancer dancer = (Dancer) person;
                basePersonActionServiceImpl = new DancerActionServiceImpl(dancer.getName(), dancer.getLastName());

            } else if (person instanceof Singer) {
                Singer singer = (Singer) person;
                basePersonActionServiceImpl =  new SingerActionServiceImpl(singer.getName(), singer.getLastName());


            } else if (person instanceof Programmer) {
                Programmer programmer = (Programmer) person;
                basePersonActionServiceImpl = new ProgrammerActionServiceImpl(programmer.getName(), programmer.getLastName());

            }
       try {
           if(basePersonActionServiceImpl == null) throw new ValidationException("not supported");
       }catch (ValidationException e){
           System.out.println(e.getMessage());
       }
        return basePersonActionServiceImpl;
    }

    /**
     *this methods is fabric method which creates person
     * depend on it's type,you should use it if tou want to set arguments
     */
    public static BasePerson createFirstPerson(int choice){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input name :");
        String name = scanner.nextLine();
        System.out.println("input lastName :");
        String lastName = scanner.nextLine();
        switch(choice){
            case 1:
                Dancer dancer = new Dancer(name, lastName);
                System.out.println("input groupName :");
                dancer.setGroupName(scanner.nextLine());
                System.out.println("input type for dancer : 1) LATINO : 2) TRADITIONAL_ARMENIAN : 3) CONTEMPORARY");
                try {
                    dancer.setDancerType(Integer.parseInt(scanner.nextLine()));
                }catch(InvalidTypeException e){
                    e.getMessage();
                }

                return dancer;
            case 2:
                Singer singer = new Singer(name,lastName);
                System.out.println("input BandName :");
                singer.setBandName(scanner.nextLine());
                System.out.println("input type for Singer : 1) Jazz : 2) Rock: 3) Pop");
                try {
                    singer.setSingerType(Integer.parseInt(scanner.nextLine()));
                }catch(InvalidTypeException e){
                    e.getMessage();
                }

                return singer;
            case 3:
                Programmer programmer = new Programmer(name, lastName);
                System.out.println("input companyName :");
                programmer.setCompanyName(scanner.nextLine());
                System.out.println("1) Data : 2) SoftWare : 3) HardWare");
                try {
                    programmer.setProgrammerType(Integer.parseInt(scanner.nextLine()));
                }catch(InvalidTypeException e){
                    e.getMessage();
                }

                return programmer;
            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }
    }
}
