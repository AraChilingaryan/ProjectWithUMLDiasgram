package com.beyond.person.core.exceptoons;

public class InvalidGenderException extends RuntimeException{
    public InvalidGenderException() {
        super("Incorrect Gender type");
    }
}
