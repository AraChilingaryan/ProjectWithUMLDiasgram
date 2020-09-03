package com.beyond.person.core.service.getMethods;

import com.beyond.person.core.enumaration.Designation;
import com.beyond.person.core.model.BasePerson;

import java.util.*;
import java.util.stream.Collectors;

public class GetAllPerson implements GetMethodsInterface{
    private static Map<Integer, BasePerson> personsMap;
    private Map<Integer, BasePerson> personsMapForRemove = new HashMap<>();
    private  List<BasePerson> listForRemovedElement = new ArrayList<>();

    public GetAllPerson(Map<Integer, BasePerson> personsMap){
        this.personsMap = personsMap;
        personsMapForRemove = personsMap.entrySet()
                .stream()
                .collect(
                        Collectors
                                .toMap(Map.Entry::getKey,
                                        Map.Entry::getValue));
    }


    Scanner scanner = new Scanner(System.in);
    public List<BasePerson> getAllPersons(){
       return personsMap.values().stream().collect(Collectors.toList());
    }

    @Override
    public List<BasePerson> getAllByType() {
        System.out.println("Dancer : 1  SInger : 2  Programmer : 3");
        int number = Integer.parseInt(scanner.nextLine());
        Designation designation = Designation.getById(number);
        return personsMap.values().stream()
                .filter(basePerson -> designation.equals(basePerson.getDesignation()))
                .collect(Collectors.toList());
    }

    public void remove(int id){
        listForRemovedElement.add(personsMapForRemove.entrySet().iterator().next().getValue());
        personsMapForRemove.remove(id); //removeIf(map -> map.getKey() == id);
    }

    @Override
    public List<BasePerson> getAllOnlyActive() {
        return personsMapForRemove.values().stream().collect(Collectors.toList());
    }

    @Override
    public List<BasePerson> getAllOnlyActiveByTYpe() {
        System.out.println("Dancer : 1  SInger : 2  Programmer : 3");
        int number = Integer.parseInt(scanner.nextLine());
        Designation designation = Designation.getById(number);
        return personsMapForRemove.values().stream()
                .filter(basePerson -> designation.equals(basePerson.getDesignation()))
                .collect(Collectors.toList());
    }

    @Override
    public List<BasePerson> getAllRemoved() {
        return listForRemovedElement;
    }

    @Override
    public List<BasePerson> getAllRemovedByType() {
        System.out.println("Dancer : 1  SInger : 2  Programmer : 3");
        int number = Integer.parseInt(scanner.nextLine());
        Designation designation = Designation.getById(number);
        return listForRemovedElement.stream()
                .filter(basePerson -> designation.equals(basePerson.getDesignation()))
                .collect(Collectors.toList());
    }

    @Override
    public List<BasePerson> getByID() {
        System.out.println("input id");
        int id = Integer.parseInt(scanner.nextLine());
        return personsMap.values().stream()
                .filter(basePerson -> id == basePerson.getId())
                .collect(Collectors.toList());
    }

}
