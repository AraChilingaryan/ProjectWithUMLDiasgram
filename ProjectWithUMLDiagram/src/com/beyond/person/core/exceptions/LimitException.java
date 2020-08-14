package com.beyond.person.core.exceptions;

public class LimitException extends BaseException {

    @Override
    protected void getInfo() {
        System.out.println("You will be fat : be careful");
    }
}