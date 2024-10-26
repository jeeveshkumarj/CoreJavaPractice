package com.Destination.StringPrograms;

import java.util.Scanner;

public class StringSumProd {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the string");
        String str = sc.nextLine();

        int sum = 0;
        int product = 1;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a digit
            if (Character.isDigit(ch)) {
                int digit = Character.getNumericValue(ch);
                sum += digit;
                product *= digit;
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
