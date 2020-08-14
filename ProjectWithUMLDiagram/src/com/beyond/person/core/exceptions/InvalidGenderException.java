package com.beyond.person.core.exceptions;

public class InvalidGenderException extends BaseException {

    @Override
    protected void getInfo() {
        System.out.println("Incorrect gender : be careful");
    }
}
