package com.Destination.Array;
import java.util.*;

public class ArrayOperation4 {
	int arr[][][];
	int cls;
	int stu;
	int clg;
	
	
	void create(int o,int n,int m) {
		cls=m;
		stu=n;
		clg=o;
		arr=new int[o][n][];
		System.out.println("Array is created successfully");
		System.out.println("==============================");
		
	}
	
	void addData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Collecting data....");
		for(int i=0;i<clg;i++) {
			
			System.out.println("Inside college no"+(i+1));
			for(int j=0;j<cls;j++) {
				System.out.println("Inside Class no :"+(j+1));
				for(int k=0;k<stu;k++) {
					System.out.println("Enter the marks of student no "+(k+1));
					arr[i][j][k]=sc.nextInt();
				}
				
			}
		}
		System.out.println("Marks successfully inserted!!!");
	}
	
	void display() {
		System.out.println("Display array data:");
		for(int i=0;i<clg;i++) {
			System.out.println("Inside college no"+(i+1));
			for(int j=0;j<cls;j++) {
				System.out.println("Inside class no"+(j+1));
				for(int k=0;k<stu;k++) {
					System.out.println("Marks of student no"+(k+1)+" is "+arr[i][j][k]);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		ArrayOperation4 ob=new ArrayOperation4();
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
