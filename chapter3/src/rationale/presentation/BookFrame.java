package rationale.presentation;

import rationale.domain.Book;
import rationale.domain.BookRepository;

import java.awt.*;

public class BookFrame extends Frame {
    private Label lTitle, lAuthor;
    private TextField tfTitle, tfAuthor;
    private Button bAdd,bClose;
    private BookRepository bookRepository;

    public BookFrame()  {
        super("Add books");
        setSize(250,200);
        setLayout(new FlowLayout());
        bookRepository=new BookRepository();
        lTitle=new Label("Title");
        lAuthor=new Label("Author");
        tfTitle=new TextField(20);
        tfAuthor=new TextField(20);
        bAdd=new Button("Add");
        bClose=new Button("Close");
        add(lTitle); add(tfTitle);
        add(lAuthor); add(tfAuthor);
        add(bAdd); add(bClose);

        bClose.addActionListener(e->System.exit(0));
        bAdd.addActionListener(e->bookRepository.add(new Book(tfTitle.getText(),tfAuthor.getText())));
    }
}
