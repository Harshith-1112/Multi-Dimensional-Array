package com.codegnan.assignmentquestionday12arrays;

import java.util.Scanner;

public class RowWiseSum2DArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		// Input: rows and columns
		System.out.println("Enter number of rows: ");
		int rows=sc.nextInt();
		
		System.out.println("Enter number of columns: ");
		int cols=sc.nextInt();
		
		// Declare 2D array
		int[][] arr=new int[rows][cols];
		
		// Input elements
		System.out.println("\nEnter elements of the array: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		// Row-wise sum calculator
		System.out.println("\nRow-wise Sum: ");
		for(int i=0;i<rows;i++) {
			int rowSum=0;
			for(int j=0;j<cols;j++) {
				rowSum+=arr[i][j];
			}
			System.out.println("Sum of Row "+(i+1)+"="+ rowSum);
		}
		sc.close();
	}

}
