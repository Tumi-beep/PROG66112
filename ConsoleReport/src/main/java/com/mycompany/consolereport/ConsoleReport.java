/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consolereport;

import java.util.Scanner;

/**
 *
 * @author b7708
 */
public class ConsoleReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Single-dimensional array for cities
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        
        // Two-dimensional array for sale: 3 cities (rows), 3 console types (columns)[cite: 7]
        int[][] Sales = new int[3][3];
        
        // 1. Prompt user for input[cite: 7]
        for (int i = 0; i < cities.length; i++) {
            System.out.print("Enter the number of PS5 sold " + cities[i] + ": ");
            Sales[i][0] = scanner.nextInt();
            
            System.out.print("Enter the number of Xbox sold " + cities[i] + ": ");
            Sales[i][1] = scanner.nextInt();
            
            System.out.print("Enter the number of Switches sold " + cities[i] + ": ");
            Sales[i][3] = scanner.nextInt();
        }
        
        // 2. Display SALE Report[cite: 7]
        System.out.println("\n---------------------------------------------------------");
        System.out.println("GAME CONSOLE REPORT");
        System.out.println("---------------------------------------------------------");
        System.out.printf("%-20s %-15s %-15s\n", "", "Console", "PS5");
        
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s %-15d %-15d\n", cities[i], Sales[i][0], Sales[i][1]);
        }
        
        // 3. Calculate Totals and Determine Highest[cite: 7]
        System.out.println("---------------------------------------------------------");
        System.out.println("CONSOLE SALE TOTALS FOR EACH CITY");
        System.out.println("---------------------------------------------------------");
        
        int maxAccidents = 0;
        String cityWithMostSaless = "";
        
        for (int i = 0; i < cities.length; i++) {
            int cityTotal = Sales[i][0] + Sales[i][1];
            System.out.printf("%-20s %d\n", cities[i], cityTotal);
            
            // Logic to find the city with the greatest number of road accidents[cite: 7]
            if (cityTotal > maxAccidents) {
                maxAccidents = cityTotal;
                String cityWithMostSales = cities[i];
            }
        }
        
        System.out.println("---------------------------------------------------------");
        String cityWithMostSales = null;
        System.out.println("CITY WITH THE MOST SALES: " + cityWithMostSales); //[cite: 7]
        System.out.println("---------------------------------------------------------");
        
        scanner.close();
    }
}

