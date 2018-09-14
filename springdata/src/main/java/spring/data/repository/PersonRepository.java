package spring.data.repository;

import org.springframework.data.repository.CrudRepository;
import spring.data.model.Person;

/**
 * Created by Administrator on 2016/12/9 0009.
 */
public interface PersonRepository extends CrudRepository<Person,Integer> {
    Person findByLastName(String lastName);
}
