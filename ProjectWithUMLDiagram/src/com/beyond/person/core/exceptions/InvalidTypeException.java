package com.beyond.person.core.exceptions;

public class InvalidTypeException extends BaseException {

    @Override
    protected void getInfo() { System.out.println("Incorrect type : be careful"); }
}