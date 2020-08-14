package com.beyond.person.core.exceptions;

public class PersonNotFoundException extends BaseException {

    @Override
    protected void getInfo() {
        System.out.println("Incorrect person : be careful");
    }
}
