/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reversearray;

import java.util.Scanner;

/**
 *
 * @author dsu-9
 */
public class ReverseArray {
    public static void main(String[] args) {
        // Input the size of the array
        try (Scanner scanner = new Scanner(System.in)) {
            // Input the size of the array
            System.out.print("Enter the number of elements in the array: ");
            int n = scanner.nextInt();
            
            // Initialize the array
            int[] array = new int[n];
            
            // Input elements of the array
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                System.out.print("Element [" + i + "]: ");
                array[i] = scanner.nextInt();
            }
            
            // Reverse the array
            for (int i = 0; i < n / 2; i++) {
                // Swap elements
                int temp = array[i];
                array[i] = array[n - 1 - i];
                array[n - 1 - i] = temp;
            }
            
            // Display the reversed array
            System.out.println("Reversed array:");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}