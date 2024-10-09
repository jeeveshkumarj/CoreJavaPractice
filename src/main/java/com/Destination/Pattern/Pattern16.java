package com.Destination.Pattern;


import java.util.Scanner;

public class Pattern16 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the size");
			int n= sc.nextInt();
			
			for(int i=0;i<=n;i++) {
				for(int j=n;j>=i;j--) {
					System.out.print("# ");
				}
				System.out.println();
			}

		
	}

}
