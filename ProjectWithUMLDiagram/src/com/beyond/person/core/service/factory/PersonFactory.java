package com.beyond.person.core.service.factory;

import com.beyond.person.core.exceptions.NotFoundException;
import com.beyond.person.core.exceptions.ValidationException;
import com.beyond.person.core.model.BasePerson;
import com.beyond.person.core.model.Dancer;
import com.beyond.person.core.model.Programmer;
import com.beyond.person.core.model.Singer;
import com.beyond.person.core.service.impl.DancerActionServiceImpl;
import com.beyond.person.core.service.impl.ProgrammerActionServiceImpl;
import com.beyond.person.core.service.impl.SingerActionServiceImpl;
import com.beyond.person.core.service.BasePersonActionService;

public class PersonFactory {
    private BasePersonActionService basePersonActionServiceImpl;


    /**
     * method for generating person of a type
     */
    public BasePersonActionService getPersonType(BasePerson person) {
            if (person instanceof Dancer) {
                Dancer dancer = (Dancer) person;
                basePersonActionServiceImpl = new DancerActionServiceImpl(dancer.getName(), dancer.getLastName(), dancer.getGroupName(), dancer.getDesignation());

            } else if (person instanceof Singer) {
                Singer singer = (Singer) person;
                basePersonActionServiceImpl =  new SingerActionServiceImpl(singer.getName(), singer.getLastName(), singer.getBandName(), singer.getDesignation());


            } else if (person instanceof Programmer) {
                Programmer programmer = (Programmer) person;
                basePersonActionServiceImpl = new ProgrammerActionServiceImpl(programmer.getName(), programmer.getLastName(), programmer.getCompanyName(), programmer.getDesignation());

            }
       try {
           if(basePersonActionServiceImpl == null) throw new ValidationException(new NotFoundException());
       }catch (ValidationException e){
           e.getInfo();
       }
        return basePersonActionServiceImpl;
    }
}
