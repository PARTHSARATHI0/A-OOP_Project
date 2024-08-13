package SOLID;

//LibraryManagementSystem.java
import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
 private List<Book> books;
 private List<Member> members;
 private BorrowingService borrowingService;

 public LibraryManagementSystem() {
     books = new ArrayList<>();
     members = new ArrayList<>();
     borrowingService = new LibraryBorrowingService();
 }

 public void addBook(Book book) {
     books.add(book);
 }

 public void addMember(Member member) {
     members.add(member);
 }

 public void borrowBook(String memberId, String bookTitle) {
     Member member = findMemberById(memberId);
     Book book = findBookByTitle(bookTitle);
     if (member != null && book != null) {
         borrowingService.borrowBook(member, book);
     } else {
         System.out.println("Invalid member ID or book title.");
     }
 }

 public void returnBook(String memberId, String bookTitle) {
     Member member = findMemberById(memberId);
     Book book = findBookByTitle(bookTitle);
     if (member != null && book != null) {
         borrowingService.returnBook(member, book);
     } else {
         System.out.println("Invalid member ID or book title.");
     }
 }

 private Member findMemberById(String memberId) {
     return members.stream()
             .filter(member -> member.getMemberId().equals(memberId))
             .findFirst()
             .orElse(null);
 }

 private Book findBookByTitle(String bookTitle) {
     return books.stream()
             .filter(book -> book.getTitle().equals(bookTitle))
             .findFirst()
             .orElse(null);
 }

 public static void main(String[] args) {
     LibraryManagementSystem system = new LibraryManagementSystem();

     // Add books
     system.addBook(new LibraryBook("The Hobbit", "J.R.R. Tolkien"));
     system.addBook(new LibraryBook("1984", "George Orwell"));

     // Add members
     system.addMember(new LibraryMember("Parthsarathi", "M001"));
     system.addMember(new LibraryMember("Abhinay", "M002"));

     // Borrow and return books
     system.borrowBook("M001", "The Hobbit");
     system.returnBook("M001", "The Hobbit");

     system.borrowBook("M002", "1984");
 }
}
