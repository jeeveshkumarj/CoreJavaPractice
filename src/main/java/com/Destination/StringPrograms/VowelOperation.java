package com.Destination.StringPrograms;

import java.util.Scanner;

public class VowelOperation {
	int total_vowel;
	int total_consonant;
	int non_alpha;
	int total_capital_vowel;
	int total_lower_case_vowel;
	
	public void countAllVowels(String str) {
		str=str.toUpperCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<=90 ) {
				if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U' ) {
					total_vowel++;
				}
				else {
					total_consonant++;
				}
			}
			else {
				non_alpha++;
			}
		}
		System.out.println("The total vowel count is "+total_vowel);
		System.out.println("The total consonant count is "+total_consonant);
		System.out.println("Non Alphabet count is "+non_alpha);
	}
	
	
	
	public void capitalVowels(String str) {
		for(int i=0;i<str.length();i++) {
				if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U' ) {
					total_capital_vowel++;
				}
		}
		System.out.println("The total  capital vowel count is "+total_capital_vowel);
		System.out.println("--------------------------------------------");
	}
		
	public void lowerCaseVowels(String str) {
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ) {
				total_lower_case_vowel++;
			}
	}
	System.out.println("The total lower case vowel count is "+total_lower_case_vowel);
	System.out.println("--------------------------------------------");
		
	}
	public void replaceAllVowels(String str) {
		String str_temp="";
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U' 
				|| str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				str_temp=str_temp +'$';
			}
			else {
				str_temp=str_temp+ str.charAt(i);
			}
		}
		System.out.println("The replaced string is :"+str_temp );
		System.out.println("-------------------------------");
	}
	
	public void replaceUpperCaseVowels(String str) {
		String str_temp="";
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U' ) {
				str_temp=str_temp +'$';
			}
			else {
				str_temp=str_temp+ str.charAt(i);
			}
		}
		System.out.println("The replaced capital string is :"+str_temp );
		System.out.println("-------------------------------");
		
		
	}
	
	public void replaceLowerCaseVowels(String str) {
		String str_temp="";
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				str_temp=str_temp +'$';
			}
			else {
				str_temp=str_temp+ str.charAt(i);
			}
		}
		System.out.println("The replaced lower case string is :"+str_temp );
		System.out.println("-------------------------------");
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		VowelOperation vo=new VowelOperation();
		vo.countAllVowels(str);
		vo.capitalVowels(str);
		vo.lowerCaseVowels(str);
		vo.replaceAllVowels(str);
		vo.replaceUpperCaseVowels(str);
		vo.replaceLowerCaseVowels(str);
	}
}
