package com.codegnan.assignmentquestionday12arrays;

import java.util.Scanner;

public class RowColumnProduct2DArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input: rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        // Input array elements
        System.out.println("\nEnter elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Row-wise product
        System.out.println("\nRow-wise Product:");
        for (int i = 0; i < rows; i++) {
            int rowProduct = 1;
            for (int j = 0; j < cols; j++) {
                rowProduct *= arr[i][j];
            }
            System.out.println("Product of Row " + (i + 1) + " = " + rowProduct);
        }

        // Column-wise product
        System.out.println("\nColumn-wise Product:");
        for (int j = 0; j < cols; j++) {
            int colProduct = 1;
            for (int i = 0; i < rows; i++) {
                colProduct *= arr[i][j];
            }
            System.out.println("Product of Column " + (j + 1) + " = " + colProduct);
        }

        sc.close();
    }
}
