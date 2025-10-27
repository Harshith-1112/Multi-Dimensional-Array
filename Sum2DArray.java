package com.codegnan.assignmentquestionday12arrays;

import java.util.Scanner;

public class Sum2DArray {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		// Input: rows and columns
		System.out.println("Enter number of rows: ");
		int rows=scanner.nextInt();
		
		System.out.println("Enter number of columns: ");
		int cols=scanner.nextInt();
		
		// Declare 2D arary
		int[][] arr=new int[rows][cols];
		
		// Input elements
		System.out.println("\nEnter elements of the array: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j]=scanner.nextInt();
			}
		}
		
		// Calculate sum of all elements
		int sum=0;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				sum+=arr[i][j];
			}
		}
		//Output
		System.out.println("\nSum of all elements= "+sum);
		scanner.close();
	}

}
