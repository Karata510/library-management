import java.util.HashSet;
import java.util.Scanner;

public class LibraryService {

    HashSet<Book> empset = new HashSet<Book>();

    Book book = new Book("Author", "uthor", 12, "Author");

    public LibraryService() {
        empset.add(book);
    }

    boolean found;
    String name;
    String ISBN;
    int id;
    String Author;

    Scanner scanner = new Scanner(System.in);

    public void addBook() {
        System.out.print("Enter book id: ");
        id = scanner.nextInt();
        System.out.print("Enter book name: ");
        name = scanner.next();
        System.out.print("Enter book ISBN: ");
        ISBN = scanner.next();
        System.out.print("Enter book Author: ");
        Author = scanner.next();
        Book book = new Book(name, ISBN, id, Author);
        empset.add(book);
    }

    public void getBook() {
        for (Book book : empset) {
            System.out.print("Enter id of the book you want: ");
            id = scanner.nextInt();
            if (id == book.getId()) {
                System.out.print(book);
                found = true;
            }
            if (!found) {
                System.out.print("No book for provided id: " + id);
            }
        }
    }

    public void getBooks() {
        for (Book book : empset) {
            System.out.print(book);
        }
    }

    public void updateBook() {
        System.out.print("Enter id number for the book: ");
        for (Book book1 : empset) {
            id = scanner.nextInt();
            if (id == book1.getId()) {
                System.out.print("Enter book name: ");
                name = scanner.nextLine();
                book1.setName(name);
                System.out.print("Enter book ISBN: ");
                ISBN = scanner.nextLine();
                book1.setISBN(ISBN);
                System.out.print("Enter book Author: ");
                Author = scanner.nextLine();
                book1.setAuthor(Author);
                System.out.println("Details updated are: ");
                System.out.print(book1);
            }
        }
    }

    public void deleteBook() {
        System.out.println("Enter id of a book want to delete: ");
        id = scanner.nextInt();
        Book deleteBook = null;
        for (Book book1 : empset) {
            if (id == book1.getId()) {
                deleteBook = book1;
                empset.remove(deleteBook);
            } else {
                System.out.println("No book for this id: " + id);
            }
        }
    }

    public void deleteBooks() {
        empset.removeAll(empset);
    }
}
