package com.Destination.Pattern;

import java.util.Scanner;

public class Pattern18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n= sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("# ");
			}
			
				for(int k=n;k>=i;k--) {
					System.out.print("- ");
				}
			System.out.println();
		}

	}

}