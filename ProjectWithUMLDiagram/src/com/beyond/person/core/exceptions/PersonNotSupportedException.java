package com.beyond.person.core.exceptions;

public class PersonNotSupportedException  extends BaseException {

    @Override
    protected void getInfo() {
        System.out.println("Incorrect person : you cant create anymore : bye");
    }
}
