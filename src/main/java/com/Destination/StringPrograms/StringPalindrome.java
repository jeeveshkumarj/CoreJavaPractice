package com.Destination.StringPrograms;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  string");
		String str=sc.next();
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev + str.charAt(i);
		}
		System.out.println("---------------------------------");
		
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("Given String is plaindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

}
