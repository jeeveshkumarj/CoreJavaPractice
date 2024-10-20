package com.Destination.ArrayProblems;

import java.util.Scanner;

public class ArraySort {
	int arr[];
	int size;
	Scanner sc=new Scanner(System.in);
	
	void createArray(int n) {
		size=n;
		arr=new int[size];
		System.out.println("Array is created");
	}
	
	void insert() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the array element "+(i+1));
			arr[i]=sc.nextInt();		}
		}
	
	void display() {
		System.out.println("The array elements are:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");		
		}	
	}
	
	void sort() {
		System.out.println("The sorted array is");
		int temp=0;
		for(int i=0;i<arr.length;i++) {                  //bubble sort
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		ArraySort ao=new ArraySort();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		ao.createArray(n);
		ao.insert();
		ao.display();
		ao.sort();
	}

}
