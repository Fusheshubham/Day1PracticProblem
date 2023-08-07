package com.practice;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the year from the user
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        // Check if the year is valid (year >= 1582)
        if (year < 1582) {
            System.out.println("Invalid year. The LeapYear program works only for years greater than or equal to 1582.");
        } else {
            // Check if the year is a leap year according to the rules
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            if (isLeapYear) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }

        scanner.close();
    }
}
