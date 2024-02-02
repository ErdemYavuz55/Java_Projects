# Temperature Converter in Java

## Introduction
This application converts temperatures from Fahrenheit to Celsius. It's a simple demonstration of basic arithmetic operations and user input handling in Java.

## Features
- Converts Fahrenheit to Celsius.
- Takes user input for the temperature in Fahrenheit.
- Displays the converted temperature in Celsius.

## How to Compile and Run
1. Compile the source file:
2. Run the compiled class:
3. Enter the Fahrenheit temperature when prompted, and the program will display the corresponding Celsius temperature.

## Example Usage
- Enter temperature in Fahrenheit: `68`
- Output: `68.0 degree Fahrenheit is equal to 20.0 in Celsius.`

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius.");
    }
}
