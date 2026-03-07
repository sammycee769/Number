package numberprofile;

import java.util.Scanner;

public class NumberProfiler {
    static void main(String[] args) {
        String numberExplanation = """
                ============= 1Numbers Explanation =============
                o Integer: Whole numbers including negatives, zero, and positives.
                o Natural Number: Counting numbers starting from 1.
                o Whole Number: Non-negative integers including zero.
                o Prime Number: Greater than 1, divisible only by 1 and itself.
                o Composite Number: Greater than 1, divisible by more than two numbers.
                o Even Number: Divisible by 2.
                0 Odd Number: Not divisible by 2.
                o Perfect Number: Sum of proper divisors equals the number.
                o Abundant Number: Sum of proper divisors greater than the number.
                o Deficient Number: Sum of proper divisors less than the number.
                o Square Number: Number multiplied by itself.
                o Cube Number: Number multiplied by itself twice.
                o Palindrome Number: Reads the same forwards and backwards.
                o Fibonacci Number: Part of the Fibonacci sequence (0, 1, 1, 2, 3, 5, ...).
                o Triangular Number: Can form a triangle of dots; sum of first n natural
                numbers.
                o Armstrong / Narcissistic Number: Sum of digits each raised to the
                number of digits equals the number.
                o Binary / Octal / Hexadecimal: Representations in base 2, 8, or 16
                respectively.
                o Digital Sum: Sum of all digits.
                o Factorial: Product of all positive integers up to the number.
                """;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = input.nextDouble();
        NumberProfileChecker.profileChecker(number);
        System.out.println(numberExplanation);


    }
}
