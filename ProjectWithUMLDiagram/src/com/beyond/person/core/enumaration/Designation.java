package com.beyond.person.core.enumaration;

import com.beyond.person.core.exception.InvalidTypeException;

public enum Designation {
    DANCER(1),
    SINGER(2),
    PROGRAMMER(3);

    private int id;

    Designation(int id){
        this.id = id;
    }

    public static Designation getById(int id) {
        for(Designation type : values()) {
            if(type.id == id) return type;
        }
        throw new InvalidTypeException("Bad Designation id: " + id);
    }
}
