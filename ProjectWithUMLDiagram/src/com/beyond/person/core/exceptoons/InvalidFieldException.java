package com.beyond.person.core.exceptoons;

public class InvalidFieldException extends RuntimeException {
    public InvalidFieldException() {
        super("String not accepted!");
    }
}
