package com.beyond.person.core.exceptions;

public class InvalidNickNameException extends BaseException {

    @Override
    protected void getInfo() { System.out.println("Incorrect nickname : be careful"); }
}