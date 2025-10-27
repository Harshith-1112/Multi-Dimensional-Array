package com.codegnan.assignmentquestionday12arrays;

import java.util.Scanner;

public class ColumnWiseSum2DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Input: rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Declare 2D array
        int[][] arr = new int[rows][cols];

        // Input elements
        System.out.println("\nEnter elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Column-wise sum calculation
        System.out.println("\nColumn-wise Sum:");
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += arr[i][j];
            }
            System.out.println("Sum of Column " + (j + 1) + " = " + colSum);
        }

        sc.close();

	}

}
