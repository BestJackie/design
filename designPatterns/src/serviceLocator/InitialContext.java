package serviceLocator;

/**
 * Created by Administrator on 2017/1/9 0009.
 */
public class InitialContext {
    public Service lookup(String jndiName){
        if (jndiName.equalsIgnoreCase("SERVICE1")){
            System.out.println("Looking up and creating a new Service1 object");
            return new Service1();
        }else {
            System.out.println("Looking up and creating a new Service2 object");
            return new Service2();
        }
    }
}
