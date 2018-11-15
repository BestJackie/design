package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/28 0028.
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePerson = new ArrayList();
        for (Person person : persons) {
            if (person.getMaritalStatus().equalsIgnoreCase("Single")){
                singlePerson.add(person);
            }
        }
        return singlePerson;
    }
}
