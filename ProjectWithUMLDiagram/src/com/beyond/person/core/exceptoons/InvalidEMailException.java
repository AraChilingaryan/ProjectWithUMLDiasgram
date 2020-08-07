package com.beyond.person.core.exceptoons;

public class InvalidEMailException extends RuntimeException{
    public InvalidEMailException() {
        super("Incorrect email");
    }
}
