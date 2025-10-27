package com.codegnan.assignmentquestionday12arrays;

import java.util.Scanner;

public class MultiplyMatrices {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input dimensions for first matrix
        System.out.print("Enter rows of first matrix: ");
        int r1 = sc.nextInt();

        System.out.print("Enter columns of first matrix: ");
        int c1 = sc.nextInt();

        // Input dimensions for second matrix
        System.out.print("Enter rows of second matrix: ");
        int r2 = sc.nextInt();

        System.out.print("Enter columns of second matrix: ");
        int c2 = sc.nextInt();

        // Check for matrix multiplication condition
        if (c1 != r2) {
            System.out.println("\nMatrix multiplication not possible!");
            System.out.println("Columns of first matrix must equal rows of second matrix.");
            sc.close();
            return;
        }

        // Declare matrices
        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];
        int[][] C = new int[r1][c2]; // result matrix

        // Input first matrix
        System.out.println("\nEnter elements of first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        System.out.println("\nEnter elements of second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Multiply matrices
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Display result
        System.out.println("\nResultant Matrix (A × B):");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
