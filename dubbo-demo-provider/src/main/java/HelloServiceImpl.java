import com.me.HelloService;

/**
 * @author Jerry Lee
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        System.out.println("received " + name);
        return "Hello, " + name + "!";
    }
}
