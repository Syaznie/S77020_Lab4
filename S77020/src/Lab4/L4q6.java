/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

import java.util.Scanner;

/**
 *
 * @author Syazni
 */
public class L4q6 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
        System.out.println("Enter value x1: ");
        int x1 = input.nextInt();
        System.out.println("Enter value x2: ");
        int x2 = input.nextInt();
        System.out.println("Enter value x3 ");
        int x3 = input.nextInt();
        
        double means = (x1 + x2 + x3) / 3;
        double variance = ((Math.pow(x1 - means, 2) + Math.pow(x2 - means, 2) + Math.pow(x3 - means, 2)) / 3);
        double stanDev = Math.sqrt(variance);

        // Display results
        System.out.println("Means: " + means);
        System.out.println("Variance: " + variance);
        System.out.println("Standard Deviation: " + stanDev);
    }
}
