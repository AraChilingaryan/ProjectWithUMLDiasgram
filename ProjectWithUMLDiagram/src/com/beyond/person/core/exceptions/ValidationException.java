package com.beyond.person.core.exceptions;

import com.beyond.person.core.model.BasePerson;

public  class ValidationException extends BaseException {
    BaseException exception;

    public ValidationException(BaseException exception) {
        this.exception = exception;
    }

    public void  getInfo(){
       exception.getInfo();
   }
}
