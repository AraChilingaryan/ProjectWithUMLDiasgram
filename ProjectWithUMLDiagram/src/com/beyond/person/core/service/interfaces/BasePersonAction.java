package com.beyond.person.core.service.interfaces;

import com.beyond.person.core.model.BasePerson;

public interface BasePersonAction {
    /**
     *method for everyone
     */
    default void walk(BasePerson person){
        System.out.println(person.getName() + " is walking");
    }

    void eat();
    void learn();

}
