package com.beyond.person.core.enumaration;

import com.beyond.person.core.exception.InvalidTypeException;

public enum SingerType {
    JAZZ(1),
    ROCK(2),
    POP(3);

    private int id;

    SingerType(int id){
        this.id = id;
    }

    public static SingerType getById(int id) {
        for(SingerType type : values()) {
            if(type.id == id) return type;
        }
        throw new InvalidTypeException("Bad SingerType id: " + id);
    }

}
