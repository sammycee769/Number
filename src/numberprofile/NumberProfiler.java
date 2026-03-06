package numberprofile;

import java.util.Scanner;

public class NumberProfiler {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = input.nextDouble();
        NumberProfileChecker.profileChecker(number);


    }
}
