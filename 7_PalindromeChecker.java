import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or sentence: ");
        String input = scanner.nextLine();

        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();
        String reversedInput = new StringBuilder(cleanedInput).reverse().toString();

        if (cleanedInput.equals(reversedInput)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
