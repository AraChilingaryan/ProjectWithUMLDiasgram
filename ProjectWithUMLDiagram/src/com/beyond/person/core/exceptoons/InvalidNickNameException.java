package com.beyond.person.core.exceptoons;

public class InvalidNickNameException extends RuntimeException{
    public InvalidNickNameException() {
        super("Incorrect Nick Name");
    }
}
