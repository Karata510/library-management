import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryService libservice = new LibraryService();
        boolean found = true;

        System.out.println("Welcome to libary management system: "
                + "\n Enter option you want to perform in the system: "
                + "\n1.View books: "
                + "\n2.View specific book id: "
                + "\n3.Add book to inventory: "
                + "\n4.Update book infos: "
                + "\n5.delete book: "
                + "\n6.delete All books: "
                + "\n7.Exits:");

        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.println("Enter option for operation you want to perform: ");
                int option = scanner.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("book infos below: ");
                        libservice.getBooks();
                        break;
                    case 2:
                        System.out.println("Book info below: ");
                        libservice.getBook();
                        break;
                    case 3:
                        System.out.println("A following book added: ");
                        libservice.addBook();
                        break;
                    case 4:
                        System.out.println("A following infos updated: ");
                        libservice.updateBook();
                        break;
                    case 5:
                        System.out.println("Book deleted ");
                        libservice.deleteBook();
                        break;
                    case 6:
                        System.out.println("Inventory cleared ");
                        libservice.deleteBooks();
                        break;
                    case 7:
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Enter correct choice");
                        break;
                }
            } while (found);
        }
    }
}