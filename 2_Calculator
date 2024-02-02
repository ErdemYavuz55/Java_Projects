# Basic Calculator in Java

## Introduction
This is a simple console-based calculator application in Java. It performs basic arithmetic operations like addition, subtraction, multiplication, and division.

## Features
- User can perform arithmetic operations.
- Supports addition, subtraction, multiplication, and division.
- Handles basic user input errors.

## How to Compile and Run
1. Compile the `Calculator.java` file:
2. Run the compiled class:
3. Follow the on-screen instructions to enter numbers and select an operation.

## Usage Example
- Enter the first number: `5`
- Enter the second number: `3`
- Enter the operation (+, -, *, /): `*`
- Output: `15.0`

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
            default:
                System.out.printf("Error! operator is not correct");
                return;
        }

        System.out.printf("%.1f %c %.1f = %.1f", firstNumber, operator, secondNumber, result);
    }
}
