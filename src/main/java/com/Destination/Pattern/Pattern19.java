package com.Destination.Pattern;

import java.util.Scanner;

public class Pattern19 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n= sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("- ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			for(int l=2;l<=i;l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
