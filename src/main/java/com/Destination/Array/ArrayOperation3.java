package com.Destination.Array;


import java.util.Scanner;

public class ArrayOperation3 {
	int arr[][];
	int cls;
	
	Scanner sc=new Scanner(System.in);
	
	
	void createArray(int n) {
		cls=n;
		arr=new int[n][];
		System.out.println("Collecting Student count for each class: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the student count inside class no : "+(i+1));
			int stu=sc.nextInt();
			arr[i]=new int[stu];
		}
		System.out.println("Array is created successfully");
		System.out.println("===================");
	}
	
	void addData() {
		System.out.println("Collecting array data: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside Class no: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the marks of student no"+(j+1));
				arr[i][j]=sc.nextInt();	
			}
		}
		System.out.println("Marks successfully collected");
		System.out.println("===========================");
	}
	void display() {
		System.out.println("Display array data: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside class no:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("The marks of student no "+(j+1)+" is = "+arr[i][j]);
			}
		}
	}
}

