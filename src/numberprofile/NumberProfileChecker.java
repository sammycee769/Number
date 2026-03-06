package numberprofile;

public class NumberProfileChecker {
    public static void profileChecker(double input){
        printIfTrue(isPrime(input));
        printIfTrue(isWholeNumber(input));
        printIfTrue(isSquare(input));
        printIfTrue(isInteger(input));
        printIfTrue(isEvenOdd(input));
        printIfTrue(isComposite(input));
        printIfTrue(isAbundant(input));
        printIfTrue(perfectNumber(input));
        printIfTrue(isNaturalNumber(input));
        printIfTrue(isPalindrome(input));

    }

    public static void printIfTrue(String message){
        if(message != null)
            System.out.println(message);
    }
    public static String isPrime(double number){

        if (number < 2 || number % 1 != 0)
            return null;
        int integerValue = (int)number;
        for (int divisor = 2; divisor <= integerValue / 2; divisor++) {
            if (integerValue % divisor == 0) {
                return null;
            }
        }
        return integerValue + " is prime";
    }
    public static String isNaturalNumber(double number){
        if (number > 1 && number % 1 == 0)
            return (int)number + " is a natural number";
        return null;
    }
    public static String isWholeNumber(double number){
        if (number >= 0 && number % 1 == 0)
            return (int)number + " is a whole number";
        return null;
    }
    public static String isInteger(double number){
        if (number % 1 == 0)
            return (int)number + " is an integer";
        return null;
    }
    public static String isEvenOdd(double number){
        if (number % 1 != 0)
            return null;
        int integerValue = (int)number;
        if(integerValue % 2 == 0){
            return integerValue + " is an even number";
        }
        return integerValue + " is an odd number";
    }
    public static String isComposite(double number) {
        if (number <= 1 || number % 1 != 0)
            return null;

        int num = (int) number;

        for (int count = 2; count <= num / 2; count++) {
            if (num % count == 0) {
                return num + " is composite";
            }
        }

        return null;
    }
    public static String isSquare(double number){
        if (number < 0)
            return null;
        int squareroot = (int) Math.sqrt(number);
        if (squareroot * squareroot == number)
            return number + " is a square number";
        else
            return null;
    }
    public static String perfectNumber(double number){
        int integerValue = (int)number;
        if( number == sumOfFactors(integerValue))
            return integerValue + " is a perfect number";
        return null;
    }

    public static int sumOfFactors(int number){
            int sum = 0;

            for(int count = 1; count <= number / 2; count++){
                if(number % count == 0){
                    sum += count;
                }
            }

            return sum;
        }

    public static String isAbundant(double number) {
        if (number <= 1 || number % 1 != 0)
            return null;

        int integerValue = (int) number;
        int sum = 0;

        for (int count = 1; count <= integerValue / 2; count++) {
            if (integerValue % count == 0) {
                sum += count;
            }
        }

        if (sum > integerValue) {
            return integerValue + " is an abundant number";
        }

        return null;
    }
    public static String isPalindrome(double number){

        if(number % 1 != 0) return null;

        int original = (int)number;
        int temp = original;
        int reversed = 0;

        while(temp > 0){
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        if(original == reversed)
            return original + " is a palindrome";

        return null;
    }
}
