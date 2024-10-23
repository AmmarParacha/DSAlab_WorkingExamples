/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumofnaturalnumbers;

/**
 *
 * @author dsu-9
 */
import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a natural number n: ");
            int n = scanner.nextInt();
            
            // Using the formula method
            int sumFormula = n * (n + 1) / 2;
            System.out.println("The sum of the first " + n + " natural numbers (using formula) is: " + sumFormula);
            
            // Using a loop method
            int sumLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumLoop += i; // Add each number from 1 to n
            }
            System.out.println("The sum of the first " + n + " natural numbers (using loop) is: " + sumLoop);
        }
    }
}