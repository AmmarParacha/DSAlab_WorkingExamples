/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrixaddition;

/**
 *
 * @author dsu-9
 */
import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        // Initialize the matrices
        try (Scanner scanner = new Scanner(System.in)) {
            // Initialize the matrices
            int[][] matrixA = new int[3][3];
            int[][] matrixB = new int[3][3];
            int[][] sumMatrix = new int[3][3];
            
            // Input elements for the first matrix
            System.out.println("Enter elements of the first 3x3 matrix:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Element [" + i + "][" + j + "]: ");
                    matrixA[i][j] = scanner.nextInt();
                }
            }
            
            // Input elements for the second matrix
            System.out.println("Enter elements of the second 3x3 matrix:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Element [" + i + "][" + j + "]: ");
                    matrixB[i][j] = scanner.nextInt();
                }
            }
            
            // Calculate the sum of the two matrices
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
                }
            }
            
            // Display the result
            System.out.println("Sum of the two matrices:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(sumMatrix[i][j] + " ");
                }
                System.out.println(); // New line for each row
            }
        }
    }
}