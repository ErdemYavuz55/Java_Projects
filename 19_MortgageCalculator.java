import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
       Scanner x = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = x.nextDouble();

        System.out.print("Enter annual interest rate (in percentage): ");
        double annualInterest = x.nextDouble();

        System.out.print("Enter term (in years): ");
        int term = x.nextInt();

        double monthlyInterest = annualInterest / 100 / 12;
        int totalPayments = term * 12;

        double mortgage = principal * ((monthlyInterest * Math.pow(1 + monthlyInterest, totalPayments)) / (Math.pow(1 + monthlyInterest, totalPayments) - 1));
        
        System.out.printf("Monthly payment: %.2f\n", mortgage);
    }
}

