package rationale.domain;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    List<Book> books=new ArrayList<>();
    public void add(Book book){
        books.add(book);
    }
}
