package com.beyond.person.core.exceptoons;

public class InvalidDesignationException extends RuntimeException{
    public InvalidDesignationException() {
        super("Incorrect designation");
    }
}
