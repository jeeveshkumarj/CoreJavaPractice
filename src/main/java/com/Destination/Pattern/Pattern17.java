package com.Destination.Pattern;

import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n= sc.nextInt();
		
		for(int i=0;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("- ");
			}
			for(int k=1;k<=n;k++) {
				System.out.print("# ");
			}
			System.out.println();
		}

	}

}