package com.beyond.person.core.exceptoons;

public class InvalidAgeException extends RuntimeException{
    public InvalidAgeException() {
        super("incorrect age");
    }
}
