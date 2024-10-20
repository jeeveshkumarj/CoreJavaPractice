package com.Destination.StringPrograms;

import java.util.Scanner;

public class StringVowel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  string");
		String str=sc.next();

		String temp=""; 
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.toLowerCase().charAt(i);
			if(ch=='a' || ch=='e' || ch== 'i' || ch== 'o' || ch=='u') {
				temp=temp+str.charAt(i)+" ";
				count++;
				
			}
		}
		System.out.println("The no of volwels are :"+count);
		System.out.println("Vowels are:"+temp);
		
	}


}
