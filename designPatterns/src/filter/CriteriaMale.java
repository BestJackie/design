package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/28 0028.
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePerson = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("Male")) {
                malePerson.add(person);
            }
        }
        return malePerson;
    }
}
