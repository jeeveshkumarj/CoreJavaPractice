package com.Destination.Array;

import java.util.Scanner;

public class ArrayOperation2 {
	int arr[][];
	int cls;
	int stu;
	
	
	void create(int n,int m) {
		cls=m;
		stu=n;
		arr=new int[m][n];
		System.out.println("Array is created successfully");
		System.out.println("==============================");
		
	}
	
	void addData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Collecting data....");
		for(int i=0;i<cls;i++) {
			System.out.println("Inside class no"+(i+1));
			for(int j=0;j<stu;j++) {
				System.out.println("Enter the marks of student no :"+(j+1));
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Marks successfully inserted!!!");
	}
	
	void display() {
		System.out.println("Display array data:");
		for(int i=0;i<cls;i++) {
			System.out.println("Inside class no"+(i+1));
			for(int j=0;j<stu;j++) {
				System.out.println("Marks of student no"+(j+1)+" is "+arr[i][j]);
			}
		}
		
	}
	
	public static void main(String[] args) {
		ArrayOperation2 ob=new ArrayOperation2();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the class count:");
		int cls=sc.nextInt();
		System.out.println("Enter the student count: ");
		int stu=sc.nextInt();
		ob.create(cls, stu);
		ob.addData();
		ob.display();
		}

}
