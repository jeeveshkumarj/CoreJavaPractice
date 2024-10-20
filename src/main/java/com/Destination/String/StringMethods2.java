package com.Destination.String;

public class StringMethods2 {
	public static void main(String[] args) {
		String str="SachinRameshTendulkar";
		//to check the string ends with specified string
		System.out.println(str.endsWith("Tendulkar"));
		System.out.println(str.endsWith("Sachin"));
		//to check if the string starts with specified string
		System.out.println(str.startsWith("Sachin"));
		System.out.println(str.startsWith("Tendulkar"));
		//to know the root class of the string
		System.out.println(str.getClass());
		//to get the unique identification object of the string
		System.out.println(str.hashCode());
		//to get the position of the specified string
		System.out.println(str.indexOf('R'));
		System.out.println(str.indexOf('z'));
	}

}
