package com.Destination.Array;

import java.util.Scanner;

class ArrayProgram3{
	public static void main(String[] args) {
		ArrayOperation3 ob=new ArrayOperation3();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the class count: ");
		int cls=sc.nextInt();
		
		ob.createArray(cls);
		ob.addData();
		ob.display();
		
	}
}

