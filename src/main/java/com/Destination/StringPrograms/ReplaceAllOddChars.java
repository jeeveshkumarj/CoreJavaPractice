package com.Destination.StringPrograms;

import java.util.Scanner;

public class ReplaceAllOddChars {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String rep="";
		char ch;
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)%2==0) {
				rep=rep+str.charAt(i);
			}
			else {
				ch=(char)(str.charAt(i)+5);
				rep=rep+ch;
			}
		}
		System.out.println("The replaced String is:"+rep);

	}

}
