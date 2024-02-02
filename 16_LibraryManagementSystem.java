import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LibrarySystem {
    private static Map<String, Integer> books = new HashMap<>();

    public static void main(String[] args) {
        books.put("The Great Gatsby", 3);
        books.put("1984", 4);
        books.put("To Kill a Mockingbird", 5);

        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("1. View Books\n2. Borrow Book\n3. Return Book\n4. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    viewBooks();
                    break;
                case 2:
                    borrowBook(scanner);
                    break;
                case 3:
                    returnBook(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void viewBooks() {
        for (String book : books.keySet()) {
            System.out.println(book + ", Copies: " + books.get(book));
        }
    }

    private static void borrowBook(Scanner scanner) {
        System.out.print("Enter book name to borrow: ");
        String bookName = scanner.nextLine();

        if (books.containsKey(bookName) && books.get(bookName) > 0) {
            books.put(bookName, books.get(bookName) - 1);
            System.out.println("You have borrowed " + bookName);
        } else {
            System.out.println("Book not available.");
        }
    }

    private static void returnBook(Scanner scanner) {
        System.out.print("Enter book name to return: ");
        String bookName = scanner.nextLine();

        if (books.containsKey(bookName)) {
            books.put(bookName, books.get(bookName) + 1);
            System.out.println("You have returned " + bookName);
        } else {
            System.out.println("Book not recognized.");
        }
    }
}

