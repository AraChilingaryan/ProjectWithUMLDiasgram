package com.beyond.person.core.exceptions;

import com.beyond.person.core.model.BasePerson;

public class InvalidDesignationException extends BaseException {

    @Override
    protected void getInfo() {
        System.out.println("Incorrect designation : be careful");
    }
}
