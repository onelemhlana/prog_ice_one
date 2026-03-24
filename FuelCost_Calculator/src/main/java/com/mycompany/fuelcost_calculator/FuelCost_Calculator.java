package com.mycompany.fuelcost_Calculator;

import java.util.Scanner;

public class FuelCost_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total trip distance (km): ");
        double distance = scanner.nextDouble();

        System.out.print("Enter the car's fuel efficiency (km per liter): ");
        double fuelEfficiency = scanner.nextDouble();

        System.out.print("Enter the fuel price per liter: ");
        double fuelPrice = scanner.nextDouble();

        double fuelNeeded = distance / fuelEfficiency;
        double totalCost = fuelNeeded * fuelPrice;

        System.out.printf("%nFuel needed: %.2f liters%n", fuelNeeded);
        System.out.printf("Total fuel cost: %.2f%n", totalCost);

        scanner.close();
    }
} 