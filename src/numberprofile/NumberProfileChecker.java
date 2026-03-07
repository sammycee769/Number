package numberprofile;

import java.util.ArrayList;

public class NumberProfileChecker {
    public static void profileChecker(double input){
        printIfTrue(isPrime(input));
        printIfTrue(isWholeNumber(input));
        printIfTrue(isSquare(input));
        printIfTrue(isInteger(input));
        printIfTrue(isEvenOdd(input));
        printIfTrue(isComposite(input));
        printIfTrue(isAbundantDeficient(input));
        printIfTrue(perfectNumber(input));
        printIfTrue(isNaturalNumber(input));
        printIfTrue(isPalindrome(input));
        printIfTrue(isCube(input));
        printIfTrue(isFibonacci(input));
        printIfTrue(isTriangular(input));
        printIfTrue(isPositiveNegativeZero(input));
        printIfTrue(isArmstrong(input));
        printIfTrue(isNarcissistic(input));
        printIfTrue(factorsOf(input));
        printIfTrue(factorialOf(input));
        printIfTrue(digitalSum(input));
        printIfTrue(toBinary(input));
        printIfTrue(toOctal(input));
        printIfTrue(toHexadecimal(input));
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
        if (number < 0 || number % 1 != 0)
            return null;
        int squareroot = (int) Math.sqrt(number);
        if (squareroot * squareroot == number)
            return number + " is a square number";
        else
            return null;
    }
    public static String isCube (double number){
        if (number < 0 || number % 1 != 0)
            return null;
        int cuberoot = (int) Math.cbrt(number);
        if (cuberoot * cuberoot * cuberoot == number)
            return number + " is a cube number";
        else
            return null;
    }
    public static String perfectNumber(double number){
        int integerValue = (int)number;
        if( integerValue == sumOfFactors(integerValue))
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

    public static String isAbundantDeficient(double number) {
        if (number <= 1 || number % 1 != 0)
            return null;

        int integerValue = (int) number;

        if (sumOfFactors(integerValue) > integerValue) {
            return integerValue + " is an abundant number";
        }
        if (sumOfFactors(integerValue) < integerValue) {
            return integerValue + " is an deficient number";
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
    public static String isFibonacci(double number){

        if(number < 0 || number % 1 != 0)
            return null;

        int integerValue = (int) number;

        int first = 0;
        int second = 1;
        int next;


        for(int count = 0; second <= integerValue; count++){

            if(second == integerValue)
                return integerValue + " is a Fibonacci number";

            next = first + second;
            first = second;
            second = next;
        }

        return null;
    }
    public static String isTriangular(double number){
        if(number <= 0 || number % 1 != 0)
            return null;

        int integerValue = (int)number;
        int triangleFormula = 8 * integerValue + 1;
        String isPerfectSquare =isSquare(triangleFormula);

        if(isPerfectSquare != null )
            return integerValue + " is a triangular number";
        return null;
    }
    public static String isPositiveNegativeZero(double number){
        if(number == 0)
            return number + " is zero";
        if (number < 0)
            return number + " is negative";
    return number + " is positive";
    }
    public static String isArmstrong(double number){

        if(number < 0 || number % 1 != 0)
            return null;

        int original = (int) number;
        int temp = original;
        int sumOfCube = 0;

        while(temp > 0){
            int digit = temp % 10;
            sumOfCube += digit * digit * digit;
            temp /= 10;
        }
        if(sumOfCube == original)
            return original + " is an Armstrong number";

        return null;
    }
    public static String isNarcissistic(double number) {

        if(number < 0 || number % 1 != 0)
            return null;

        int original = (int) number;
        int temp = original;

        int digits = 0;
        while(temp > 0){
            digits++;
            temp /= 10;
        }

        temp = original;
        int sum = 0;

        while(temp > 0){
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digits);
            temp /= 10;
        }

        if(sum == original)
            return original + " is a narcissistic number";

        return null;
    }
    public static String factorsOf(double number) {
        if(number <= 0 || number % 1 != 0)
            return null;

        int integerValue = (int) number;
        String message = "The factors of " + integerValue + " are: ";

        for(int count = 1; count <= integerValue; count++){
            if(integerValue % count == 0){
                message += count;
                message += ", ";
            }
        }

        return message;
    }
    public static String factorialOf(double number){
        if(number < 0 || number % 1 != 0)
            return null;

        int integerValue = (int) number;
        long factorial = 1;
        for (int count = 1; count <= integerValue ; count++){
            factorial *= count ;
        }
        return integerValue + "! = " + factorial;
    }
    public static String digitalSum(double number) {
        if(number < 0 || number % 1 != 0)
            return null;

        int integerValue = (int) number;
        int sum = 0;
        while (integerValue > 0) {
            sum += integerValue % 10;
            integerValue /= 10;
        }
        return "The digital sum of "+ integerValue + " is "+ sum;
    }
    public static  String toBinary(double number){
        if(number < 0 || number % 1 != 0)
            return null;
        int integerValue = (int) number;
        return "The binary value of "+ integerValue + " is "+ Integer.toBinaryString(integerValue);
    }
    public static  String toOctal(double number){
        if(number < 0 || number % 1 != 0)
            return null;
        int integerValue = (int) number;
        return "The octal value of "+ integerValue + " is "+ Integer.toOctalString(integerValue);
    }
    public static String toHexadecimal(double number){
        if(number < 0 || number % 1 != 0)
            return null;
        int integerValue = (int) number;
        return "The hexadecimal value of  "+ integerValue + " is "+ Integer.toHexString(integerValue).toUpperCase();

    }
}
