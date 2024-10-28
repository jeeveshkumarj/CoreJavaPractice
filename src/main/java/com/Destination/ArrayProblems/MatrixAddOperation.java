package com.Destination.ArrayProblems;

import java.util.Scanner;

public class MatrixAddOperation {
	int m1[][];
	
	int m2[][];
	int add[][];
	int a;
	int b;
	static Scanner sc=new Scanner(System.in);
	
	void CreateArray(int m,int n) {
		a=m;
		b=n;
// new comment from github web
		m1=new int[m][n];
		m2=new int[m][n];
		add=new int[m][n];
		
		System.out.println("Array created");
		
		
	}
	
	void collectData() {
		System.out.println("Collecting Data.....");
		System.out.println("Inside matrix 1:");
		for(int i=0;i<m1.length;i++) {
			for(int j=0;j<m1[i].length;j++) {
				System.out.println("Enter the values for m1("+i+","+j+")");
				m1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Inside matrix 2:");
		for(int i=0;i<m2.length;i++) {
			for(int j=0;j<m2[i].length;j++) {
				System.out.println("Enter the values for m2("+i+","+j+")");
				m2[i][j]=sc.nextInt();
			}
		}
		
	}
	
	void addMatrix() {
		
		for(int i=0;i<add.length;i++) {
			for(int j=0;j<add[i].length;j++) {
				add[i][j]=m1[i][j]+ m2[i][j];
			}
		}
		
	}
	
	void display() {
		System.out.println("Inside matrix 1:");
		for(int i=0;i<m1.length;i++) {
			for(int j=0;j<m1[i].length;j++) {
				System.out.print(m1[i][j]+" ");
				}
			System.out.println();
		}
		System.out.println("Inside matrix 2:");
		for(int i=0;i<m2.length;i++) {
			for(int j=0;j<m2[i].length;j++) {
				System.out.print(m2[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("addition of 2 matrix is");
		for(int i=0;i<add.length;i++) {
			for(int j=0;j<add[i].length;j++) {
				System.out.print(add[i][j]+" ");
			}
			System.out.println();
		}

	}
	public static void main(String[] args) {
		MatrixAddOperation ob=new MatrixAddOperation();
		System.out.println("Enter the value of m");
		int m=sc.nextInt();
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		ob.CreateArray(m, n);
		ob.collectData();
		ob.addMatrix();
		ob.display();
	}
}
