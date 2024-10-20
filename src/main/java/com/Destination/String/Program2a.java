package com.Destination.String;

public class Program2a {
public static void main(String[] args) {
		
		String s1=new String("Rama");
		String s2= new String("Rama");
		
			if(s1.length()==s2.length()) {
				
				if(s1.equals(s2)==true) {
					System.out.println("Strings are equal");
					}
				else {
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
