import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // A number between 1 and 100
        int numberOfTries = 0;
        int guess;
        boolean win = false;

        System.out.println("Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100.");

        while (!win) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess == numberToGuess) {
                win = true;
            } else if (guess < numberToGuess) {
                System.out.println("Higher!");
            } else if (guess > numberToGuess) {
                System.out.println("Lower!");
            }
        }

        System.out.println("You win!");
        System.out.println("The number was " + numberToGuess);
        System.out.println("It took you " + numberOfTries + " tries.");
    }
}
