package ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();
        System.out.println("Sum of digits: " + IntTools.digitSum(number));
        System.out.println("Last digit: " + IntTools.lastDigit(number));
        System.out.println("Return the digit at position: ");
        int position = scan.nextInt();
        try {
            System.out.println(IntTools.digitAt(number, position));
        } catch (NumberTooLargeException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
