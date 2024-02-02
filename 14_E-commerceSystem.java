import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ECommerceSystem {
    private static List<String> products = new ArrayList<>();
    private static List<String> cart = new ArrayList<>();

    public static void main(String[] args) {
        products.add("Laptop");
        products.add("Phone");
        products.add("Tablet");

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. View Products\n2. Add to Cart\n3. View Cart\n4. Checkout\n5. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewProducts();
                    break;
                case 2:
                    addToCart(scanner);
                    break;
                case 3:
                    viewCart();
                    break;
                case 4:
                    checkout();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 5);
    }

    private static void viewProducts() {
        System.out.println("Available Products:");
        for (String product : products) {
            System.out.println(product);
        }
    }

    private static void addToCart(Scanner scanner) {
        System.out.print("Enter product name to add to your cart: ");
        String product = scanner.next();
        if (products.contains(product)) {
            cart.add(product);
            System.out.println(product + " added to your cart.");
        } else {
            System.out.println("Product not found.");
        }
    }

    private static void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Your Cart:");
            for (String item : cart) {
                System.out.println(item);
            }
        }
    }

    private static void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Checkout successful. Thank you for your purchase!");
            cart.clear();
        }
    }
}
