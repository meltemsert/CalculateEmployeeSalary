package com.service;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day of employee please: ");
        int countOfEmployeeDays = scanner.nextInt();
        double totalSalary = calculateEmployeeSalary(countOfEmployeeDays);
        System.out.println("Salary of Employee " + totalSalary + "TL");
    }

    private static double calculateEmployeeSalary(int countDay) {
        double dailySalary = 1000.0;
        if (countDay <= 25) {
            return countDay * dailySalary;
        } else {
            double salary = countDay * dailySalary;
            int extraDay = countDay - 25;
            double prim = extraDay * dailySalary;
            return salary + prim;
        }

    }
}
