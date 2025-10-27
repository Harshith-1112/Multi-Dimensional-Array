package com.codegnan.assignmentquestionday12arrays;

import java.util.Scanner;

public class ReadPrint2DArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
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

        // Output elements
        System.out.println("\nThe 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // next line after each row
        }

        sc.close();

	}

}
