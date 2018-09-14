package spring.data.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.data.model.Person;
import spring.data.repository.PersonRepository;
import spring.data.service.PersonService;

/**
 * Created by Administrator on 2016/12/9 0009.
 */
@Service("personService")
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository repository;
    public Person save(Person person) {
        return repository.save(person);
    }
}
