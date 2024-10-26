package com.Destination.StringPrograms;

import java.util.Scanner;

public class ReplaceVowels {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		String replace="";
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			switch(str.charAt(i)) {
			case 'a': replace= replace+ '@';
						break;
			case 'e': replace= replace+ '$';
						break;
			case 'i': replace= replace+ '%';
						break;
			case 'o': replace= replace+ '&';
						break;
			case 'u': replace= replace+ '*';
						break;
			default:  replace=replace+ str.charAt(i);
						break;
				}
		}
		System.out.println("The replaced string is :"+replace);
	}
	
}
