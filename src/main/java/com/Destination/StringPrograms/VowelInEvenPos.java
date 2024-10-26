package com.Destination.StringPrograms;

import java.util.Scanner;

public class VowelInEvenPos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char arr[] = new char[str.length()];
        str = str.toLowerCase();
        int vowel = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i); 
            
       
            if (i % 2 != 0) {
                if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                    vowel = 1;
                }
            }
        }

        if (vowel == 1) {
            System.out.println("Vowels are in even positions");
        } else {
            System.out.println("Vowels are not in even positions");
        }
    }
}

