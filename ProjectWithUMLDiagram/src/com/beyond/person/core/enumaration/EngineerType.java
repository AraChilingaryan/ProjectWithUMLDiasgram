package com.beyond.person.core.enumaration;

import com.beyond.person.core.exception.InvalidTypeException;

public enum EngineerType {
    DATA(1),
    SOFTWARE(2),
    HARDWARE(3);

    private int id;
     EngineerType(int id){
         this.id = id;
     }
    public static EngineerType getById(int id) {
        for(EngineerType type : values()) {
            if(type.id == id) return type;
        }
        throw new InvalidTypeException("Bad EngineerType id: " + id);
    }
}
