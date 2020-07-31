package com.beyond.person.entrypoint;

import com.beyond.person.core.model.BasePerson;
import com.beyond.person.core.model.Dancer;
import com.beyond.person.core.model.Programmer;
import com.beyond.person.core.model.Singer;
import com.beyond.person.core.service.Factory.PersonFactory;
import com.beyond.person.core.service.implementation.DancerImpl;
import com.beyond.person.core.service.implementation.ProgrammerImpl;
import com.beyond.person.core.service.implementation.SingerImpl;

public class Main {
    public static void main(String[] args) {
        BasePerson dancer = new Dancer("Kendall", "dancer", "tango");
        BasePerson programmer = new Programmer("German", "programmer", "VOLO");
        BasePerson singer = new Singer("George", "singer", "ProjectLA");

        DancerImpl dancerPerson = (DancerImpl) PersonFactory.getPersonType(dancer);
        dancerPerson.dancing();

        SingerImpl singerPerson = (SingerImpl) PersonFactory.getPersonType(singer);
        singerPerson.singing();

        ProgrammerImpl programmerPerson = (ProgrammerImpl) PersonFactory.getPersonType(programmer);
        programmerPerson.coding();

    }
}
