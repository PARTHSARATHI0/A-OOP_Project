package SOLID;

import java.util.List;

public interface Member {
    String getName();
    String getMemberId();
    List<Book> getBorrowedBooks();
    void borrowBook(Book book);
    void returnBook(Book book);
}
