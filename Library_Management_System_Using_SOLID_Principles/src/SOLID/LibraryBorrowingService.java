package SOLID;

public class LibraryBorrowingService implements BorrowingService {

    @Override
    public void borrowBook(Member member, Book book) {
        member.borrowBook(book);
        System.out.println(member.getName() + " borrowed " + book.getTitle());
    }

    @Override
    public void returnBook(Member member, Book book) {
        member.returnBook(book);
        System.out.println(member.getName() + " returned " + book.getTitle());
    }
}