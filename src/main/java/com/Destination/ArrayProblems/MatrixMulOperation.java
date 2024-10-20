package com.Destination.ArrayProblems;

import java.util.Scanner;

public class MatrixMulOperation {
    int[][] m1;
    int[][] m2;
    int[][] res;
    int a; // Rows of matrix m1
    int b; // Columns of matrix m1 (and rows of matrix m2)
    int c; // Columns of matrix m2
    static Scanner sc = new Scanner(System.in);

    // Method to create matrices
    void CreateArray(int m, int n, int p) {
        a = m; // Rows of m1
        b = n; // Columns of m1 (and rows of m2)
        c = p; // Columns of m2
        m1 = new int[m][n]; // m1 is an m x n matrix
        m2 = new int[n][p]; // m2 is an n x p matrix
        res = new int[m][p]; // Resultant matrix will be m x p

        System.out.println("Matrices of size " + m + "x" + n + " and " + n + "x" + p + " have been created.");
    }

    // Method to collect data for both matrices
    void collectData() {
        System.out.println("Collecting Data for Matrix 1:");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                System.out.print("Enter the value for m1(" + i + "," + j + "): ");
                m1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Collecting Data for Matrix 2:");
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                System.out.print("Enter the value for m2(" + i + "," + j + "): ");
                m2[i][j] = sc.nextInt();
            }
        }
    }

    // Method to multiply two matrices
    void resMatrix() {
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                res[i][j] = 0;
                for (int k = 0; k < b; k++) { // Iterate over b (columns of m1 and rows of m2)
                    res[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
    }

    // Method to display matrices and the result
    void display() {
        System.out.println("Matrix 1:");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matrix 2:");
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                System.out.print(m2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Multiplication of the two matrices:");
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MatrixMulOperation ob = new MatrixMulOperation();
        System.out.println("Enter the number of rows (m) for Matrix 1:");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns (n) for Matrix 1 (and rows for Matrix 2):");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns (p) for Matrix 2:");
        int p = sc.nextInt();

        ob.CreateArray(m, n, p);
        ob.collectData();
        ob.resMatrix();
        ob.display();
    }
}
