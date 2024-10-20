//identity matrix

package com.Destination.ArrayProblems;

import java.util.Scanner;

public class IdentityMatrixCheck {
    int matrix[][];
    int size;
    static Scanner sc = new Scanner(System.in);

    // Step 1: Create an array for the matrix
    void CreateArray(int n) {
        size = n;
        matrix = new int[n][n];
        System.out.println("Matrix created.");
    }

    // Step 2: Collect data for the matrix
    void collectData() {
        System.out.println("Collecting Data for the matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Enter the value for matrix(" + i + "," + j + "):");
                matrix[i][j] = sc.nextInt();
            }
        }
    }


    boolean isIdentityMatrix() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j && matrix[i][j] != 1) {
                    return false; // Diagonal elements should be 1
                } else if (i != j && matrix[i][j] != 0) {
                    return false; // Non-diagonal elements should be 0
                }
            }
        }
        return true;
    }


    void display() {
        System.out.println("The matrix is:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        
        if (isIdentityMatrix()) {
            System.out.println("The matrix is an Identity Matrix.");
        } else {
            System.out.println("The matrix is NOT an Identity Matrix.");
        }
    }

    public static void main(String[] args) {
        IdentityMatrixCheck ob = new IdentityMatrixCheck();
        System.out.println("Enter the size of the matrix (n for nxn): ");
        int n = sc.nextInt();
        ob.CreateArray(n);
        ob.collectData();
        ob.display();
    }
}
