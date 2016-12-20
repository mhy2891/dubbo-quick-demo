import com.me.Book;
import com.me.StudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/**
 * Created by Kayuu-LOCAL-PC on 2016/12/20.
 */
public class StudentServiceImpl implements StudentService {
    @Override
    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("gradle 实战",98d,"小王",new Date()));
        books.add(new Book("Zookeeper 实践",198d,"小赵",new Date()));
        return books;
    }
}
