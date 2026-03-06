package numberprofile;

public class NumberProfileChecker {
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
    public static String isCompositeNumber(double number){

    }
}
