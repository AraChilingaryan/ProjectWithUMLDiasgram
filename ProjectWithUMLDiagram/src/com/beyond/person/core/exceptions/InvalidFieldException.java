package com.beyond.person.core.exceptions;

public class InvalidFieldException extends BaseException {

    @Override
    public void getInfo() {
        System.out.println("Incorrect field : be careful");
    }
}