package com.beyond.person.core.exceptoons;

public class InvalidTypeException extends RuntimeException{
    public InvalidTypeException() {
        super("Incorrect Type");
    }
}
