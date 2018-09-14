package spring.data.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.data.model.Person;
import spring.data.service.PersonService;

import java.util.Date;

/**
 * Created by Administrator on 2016/12/8 0008.
 */
public class TestDate {
    private ApplicationContext context= null;
    {
        context=new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    @Test
    public void repositoryTest(){
        Person person = new Person();
        person.setBrith(new Date());

        person.setEmail("946557022@qq.com");
        person.setLastName("HH");

        PersonService service = (PersonService) context.getBean("personService");
        service.save(person);


    }
}
