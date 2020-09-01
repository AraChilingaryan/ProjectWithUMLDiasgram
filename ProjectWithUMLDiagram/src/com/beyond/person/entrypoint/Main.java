package com.beyond.person.entrypoint;

import com.beyond.person.core.helper.SetInputArguments;
import com.beyond.person.core.model.BasePerson;
import com.beyond.person.core.service.factory.PersonFactory;
import com.beyond.person.core.service.getMethods.GetAllPerson;
import com.beyond.person.core.service.getMethods.GetMethodsInterface;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, BasePerson> personsMap= new HashMap<>();
        int count = 0;
        while(count < 3) {
            System.out.println("Dancer 1 : Singer 2 : Programmer 3: or if you want to exit push 4 ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if (choice != 1 && choice != 2 && choice != 3) {
                if(choice == 4) {
                    break;
                }
                else {
                    count++;
                }
            }else {
                BasePerson person = PersonFactory.createFirstPerson(choice);
                SetInputArguments setInputArguments = new SetInputArguments(person);
                BasePerson person1 = setInputArguments.setPerson(choice);
                personsMap.put(person1.getId(), person1);
            }
        }
        Scanner scanner = new Scanner(System.in);
        GetAllPerson getAllPersons = new GetAllPerson(personsMap);
        getAllPersons.getAllByType();
        getAllPersons.remove(1);
        List<BasePerson> list = new ArrayList<>();


    }
}




