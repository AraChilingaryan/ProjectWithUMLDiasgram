package com.beyond.person.core.enumaration;

import com.beyond.person.core.exception.InvalidTypeException;
import com.beyond.person.core.exception.ValidationException;

public enum Gender {
    MALE(1),
    FEMALE(2);

    private int id;

     Gender(int id){
        this.id = id;
    }

    public static Gender getById(int id) {
        for(Gender type : values()) {
            if(type.id == id) return type;
        }
        throw new InvalidTypeException("Bad Gender id: " + id);
    }


}
