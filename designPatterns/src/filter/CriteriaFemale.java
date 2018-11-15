package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/28 0028.
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> famalePerson = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("Female")){
                famalePerson.add(person);
            }
        }
        return famalePerson;
    }
}
