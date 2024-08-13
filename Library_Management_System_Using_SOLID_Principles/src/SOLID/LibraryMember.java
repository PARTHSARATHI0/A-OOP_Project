package SOLID;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember implements Member {
    private String name;
    private String memberId;
    private List<Book> borrowedBooks;

    public LibraryMember(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getMemberId() {
        return memberId;
    }

    @Override
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    @Override
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.setAvailable(false);
        } else {
            System.out.println("The book is not available.");
        }
    }

    @Override
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.setAvailable(true);
    }
}