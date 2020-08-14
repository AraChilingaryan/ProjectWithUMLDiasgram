package com.beyond.person.core.exceptions;

public class NotFoundException  extends BaseException {

    @Override
    protected void getInfo() {
        System.out.println("Not Found Exception : check your code");
    }
}

