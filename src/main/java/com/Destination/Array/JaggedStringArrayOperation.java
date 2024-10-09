package com.Destination.Array;

import java.util.Scanner;

public class JaggedStringArrayOperation {
	String arr[][][];
	int clg;
	
	
	void create(int m) {
		Scanner sc= new Scanner(System.in);
		arr=new String[m][][];
		System.out.println("Collecting class for each college:");
		//collect class
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the class count inside college no"+(i+1));
			int cls=sc.nextInt();
			arr[i]=new String[cls][];
		}
		//collect student
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside clg no: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the student count inside class no:"+(j+1));
				int stu=sc.nextInt();
				arr[i][j]=new String[stu];
			}
		}
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
		JaggedStringArrayOperation ob=new JaggedStringArrayOperation();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the college count:");
		int clg=sc.nextInt();
		ob.create(clg);
		ob.addData();
		ob.display();
		}

}
