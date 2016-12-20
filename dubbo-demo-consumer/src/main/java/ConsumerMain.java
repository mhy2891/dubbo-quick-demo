import com.me.Book;
import com.me.HelloService;
import com.me.StudentService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author Kayuu
 */
public class ConsumerMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application-context-consumer.xml");
        classPathXmlApplicationContext.start();
        HelloService helloService = (HelloService) classPathXmlApplicationContext.getBean("helloService");
        String world = helloService.hello("World");
        System.out.println(world);
        StudentService studentService = (StudentService) classPathXmlApplicationContext.getBean("studentService");
        List<Book> books = studentService.getBooks();
        System.out.println(books);
    }
}
