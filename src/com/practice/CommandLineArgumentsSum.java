package com.practice;

public class CommandLineArgumentsSum {
    public static void main(String[] args) {
        int sum = 0;
        int invalidCount = 0;

        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                sum += num;
            } catch (NumberFormatException e) {
                // If the argument is not a valid integer, catch the exception and count it as invalid
                invalidCount++;
            }
        }

        System.out.println("Sum of valid integers: " + sum);
        System.out.println("Number of invalid entries: " + invalidCount);
    }
}

