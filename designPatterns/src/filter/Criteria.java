package filter;

import java.util.List;

/**
 * Created by Administrator on 2016/12/28 0028.
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
