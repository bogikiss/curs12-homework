package ex3;

public class IntTools {
    public static int digitSum(int number) {
        int sum = 0;
        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }

    public static int lastDigit(int number) {
        int lastDigit = number % 10;
        return lastDigit;
    }

    public static int digitAt(int number, int position) throws NumberTooLargeException {
        String numberString = Integer.toString(number);
        if (position > numberString.length()) {
            throw new NumberTooLargeException("Position is invalid! Can't be a larger number than the number of digits!");
        }
        int result = numberString.charAt(position);
        return Character.getNumericValue(result);
    }
}
