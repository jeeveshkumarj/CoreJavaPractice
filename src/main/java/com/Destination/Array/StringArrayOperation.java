package com.Destination.Array;

import java.util.*;

public class StringArrayOperation {
	String arr[][][];
	int cls;
	int stu;
	int clg;
	
	
	void create(int o,int n,int m) {
		arr=new String[o][n][m];
		System.out.println("Array is created successfully");
		System.out.println("==============================");
		
	}
	
	void addData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Collecting data....");
		for(int i=0;i<arr.length;i++) {
			
			System.out.println("Inside college no"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside Class no :"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the name of student no "+(k+1));
					arr[i][j][k]=sc.next();
				}
				
			}
		}
		System.out.println("Name successfully inserted!!!");
	}
	
	void display() {
		System.out.println("Display array data:");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside college no"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside class no"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Name student no"+(k+1)+" is "+arr[i][j][k]);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		StringArrayOperation ob=new StringArrayOperation();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the college count:");
		int clg=sc.nextInt();
		System.out.println("Enter the class count: ");
		int cls=sc.nextInt();
		System.out.println("Enter the student count: ");
		int stu=sc.nextInt();
		ob.create(clg,cls,stu);
		ob.addData();
		ob.display();
		}

}
