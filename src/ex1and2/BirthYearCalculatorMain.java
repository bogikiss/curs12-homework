package ex1and2;

import java.util.Scanner;

public class BirthYearCalculatorMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please provide your age: ");
        int age = scan.nextInt();

        try {
            System.out.println(BirthYearCalculator.calculateBirthYear(age));
        } catch (NegativeNumberException | AgeTooLargeException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
