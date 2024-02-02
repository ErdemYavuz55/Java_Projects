import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount in USD: ");
        double amountInUsd = scanner.nextDouble();

        System.out.print("Enter the exchange rate (1 USD to target currency): ");
        double exchangeRate = scanner.nextDouble();

        double convertedAmount = amountInUsd * exchangeRate;
        System.out.println("Converted amount: " + convertedAmount);
    }
}
