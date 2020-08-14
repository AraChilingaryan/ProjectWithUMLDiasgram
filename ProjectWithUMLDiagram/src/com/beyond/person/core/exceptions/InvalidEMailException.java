package com.beyond.person.core.exceptions;

public class InvalidEMailException extends BaseException {

    @Override
    protected void getInfo() {
        System.out.println("Incorrect Email : be careful");
    }
}
