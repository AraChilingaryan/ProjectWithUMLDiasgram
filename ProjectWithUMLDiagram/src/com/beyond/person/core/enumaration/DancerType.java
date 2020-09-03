package com.beyond.person.core.enumaration;

import com.beyond.person.core.exception.InvalidTypeException;

public enum DancerType {
    LATINO(1),
    TRADITIONAL_ARMENIAN(2),
    CONTEMPORARY(3);

    private int id;
    DancerType(int id){
        this.id = id;
    }

    public static DancerType getById(int id) {
        for(DancerType type : values()) {
            if(type.id == id) return type;
        }
        throw new InvalidTypeException("Bad DancerType id: " + id);
    }
}
