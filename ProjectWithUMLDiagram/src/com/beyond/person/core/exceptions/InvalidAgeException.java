package com.beyond.person.core.exceptions;

public class InvalidAgeException extends BaseException {

    @Override
    protected void getInfo() {
        System.out.println("Incorrect age : be careful");
    }
}