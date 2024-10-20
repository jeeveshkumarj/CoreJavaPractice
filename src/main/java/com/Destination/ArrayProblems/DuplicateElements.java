package com.Destination.ArrayProblems;

import java.util.Scanner;

public class DuplicateElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[];
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		arr=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The array elements are:");
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]+" ");
		}
		System.out.println("The duplicate elements are:");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
		
		
		int[] uniqueArr = new int[size];
        int uniqueCount = 0;
        
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            // Check if the current element already exists in the uniqueArr
            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == uniqueArr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            // If not a duplicate, add to the uniqueArr
            if (!isDuplicate) {
                uniqueArr[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }
        
        // Print the unique array
        System.out.println("Array without duplicates:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueArr[i] + " ");
        }
				
	}

}
