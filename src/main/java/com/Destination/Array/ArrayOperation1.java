
package com.Destination.Array;

import java.util.Scanner;

public class ArrayOperation1 {
	int arr[];
	int size;
	
	void createArray(int n) {
		size=n;
		arr=new int[n];
		
		System.out.println("Array is created");
		System.out.println("================");
	}
	
	
	void addData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("collecting array data: ");
		for(int i=0;i<size;i++) {
			System.out.println("Enter marks of student no:"+(i+1));
			arr[i]=sc.nextInt();
			}
		System.out.println("===============================");
	}
	void display() {
		for(int i=0;i<size;i++) {
			System.out.println("Marks of student no "+(i+1)+" is "+arr[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		
		ArrayOperation1 ob=new ArrayOperation1();
		ob.createArray(n);
		ob.addData();
		ob.display();
		
	}

}
