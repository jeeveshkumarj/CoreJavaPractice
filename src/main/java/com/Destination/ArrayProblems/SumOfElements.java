//sum of element
package com.Destination.ArrayProblems;

import java.util.Scanner;

public class SumOfElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("The array elements are");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("The sum of array elements are:"+sum);
	}

}
