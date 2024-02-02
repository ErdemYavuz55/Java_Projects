import java.util.Scanner;

public class TextAdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Adventure Game!");
        System.out.println("You are in a dark room. There is a door to your left and right. Which one do you take? (left/right)");

        String choice = scanner.nextLine();
        if ("left".equalsIgnoreCase(choice)) {
            System.out.println("You find yourself in a library. You win!");
        } else if ("right".equalsIgnoreCase(choice)) {
            System.out.println("You find yourself in a dungeon with a dragon. You lose!");
        } else {
            System.out.println("Invalid choice. Game over.");
        }
    }
}
