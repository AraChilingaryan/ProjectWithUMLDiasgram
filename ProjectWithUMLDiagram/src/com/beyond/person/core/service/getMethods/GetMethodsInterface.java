package com.beyond.person.core.service.getMethods;

import com.beyond.person.core.model.BasePerson;

import java.util.List;
import java.util.Map;

public interface GetMethodsInterface {
     List<BasePerson> getAllPersons();
     List<BasePerson> getAllByType();
     List<BasePerson> getAllOnlyActive();
     List<BasePerson> getAllOnlyActiveByTYpe();
     List<BasePerson> getAllRemoved();
     List<BasePerson> getAllRemovedByType();
     List<BasePerson> getByID();
}
