package com.Destination.String;

public class Program5 {
public static void main(String[] args) {
		
		String s1="Rama";
		String s2= "RAMA";
		
			if(s1.length()==s2.length()) {
				
				if(s1.compareToIgnoreCase(s2)==0) {
					System.out.println(s1.compareToIgnoreCase(s2));
					System.out.println("Strings are equal");
					}
				else {
					System.out.println(s1.compareToIgnoreCase(s2));
					System.out.println("Strings are not equal");
					}
				System.out.println("--------------------------------");
				if(s1==s2) {
					System.out.println("References are equal");
				}
				else {
					System.out.println("references are not equal");
				}
				}
			else {
				System.out.println("Strings are not equal");
				}
		
			}

}
