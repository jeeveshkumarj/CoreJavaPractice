package com.Destination.String;

public class StringMethods1 {
	public static void main(String[] args) {
		String str="SachinRameshTendulkar";
		//convert to uppercase
		System.out.println(str.toUpperCase());
		//convert to lowercase
		System.out.println(str.toLowerCase());
		//find total length of the string
		System.out.println(str.length());
		//find the character at specific pos
		System.out.println(str.charAt(5));
		//check given substring is in main string
		System.out.println(str.contains("Ramesh"));
		System.out.println(str.contains("Umesh"));
		//Concatenate new string
		System.out.println(str.concat(" India"));
		System.out.println(str);
	}
}
