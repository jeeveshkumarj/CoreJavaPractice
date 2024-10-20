package com.Destination.StringPrograms;

import java.util.Scanner;
 
public class StringPalindrome1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int flag=0;
		System.out.println("Enter the  string");
		String str=sc.next();
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev + str.charAt(i);
		}
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=rev.charAt(i)) {
				flag=1;
				System.out.println("given string is Not palindrome");
				break;
			}
		}
		if(flag==0) {
			System.out.println("given string is a Palindrome");
		}
	}
}
