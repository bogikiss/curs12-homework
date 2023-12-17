package ex1and2;

import java.time.LocalDate;

public class BirthYearCalculator {
    public static String calculateBirthYear(int age) throws NegativeNumberException, AgeTooLargeException {
        if (age < 0){
            throw new NegativeNumberException("The age can't be a negative number!");
        }

        if (age > 150) {
            throw new AgeTooLargeException("The age can't be larger than 150");
        }
        int birthYear = LocalDate.now().getYear() - age;
        return "The birthyear is " + birthYear;
    }
}
