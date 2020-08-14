package com.beyond.person.core.service.factory;

import com.beyond.person.core.exceptions.NotFoundException;
import com.beyond.person.core.exceptions.ValidationException;
import com.beyond.person.core.model.BasePerson;
import com.beyond.person.core.model.Dancer;
import com.beyond.person.core.model.Programmer;
import com.beyond.person.core.model.Singer;
import com.beyond.person.core.service.impl.DancerActionServiceServiceImpl;
import com.beyond.person.core.service.impl.ProgrammerActionServiceServiceImpl;
import com.beyond.person.core.service.impl.SingerActionServiceServiceImpl;
import com.beyond.person.core.service.BasePersonActionService;

public class PersonFactory {
    BasePersonActionService basePersonActionServiceImpl;


    /**
     * method for generating person of a type
     */
    public BasePersonActionService getPersonType(BasePerson person) {
            if (person instanceof Dancer) {
                Dancer dancer = (Dancer) person;
                basePersonActionServiceImpl = new DancerActionServiceServiceImpl(dancer.getName(), dancer.getLastName(), dancer.getGroupName(), dancer.getDesignation());

            } else if (person instanceof Singer) {
                Singer singer = (Singer) person;
                basePersonActionServiceImpl =  new SingerActionServiceServiceImpl(singer.getName(), singer.getLastName(), singer.getBandName(), singer.getDesignation());


            } else if (person instanceof Programmer) {
                Programmer programmer = (Programmer) person;
                basePersonActionServiceImpl = new ProgrammerActionServiceServiceImpl(programmer.getName(), programmer.getLastName(), programmer.getCompanyName(), programmer.getDesignation());

            }
       try {
           if(basePersonActionServiceImpl == null) throw new ValidationException(new NotFoundException());
       }catch (ValidationException e){
           e.getInfo();
       }
        return basePersonActionServiceImpl;
    }
}
