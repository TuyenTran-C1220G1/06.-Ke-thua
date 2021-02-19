package com.company.triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter the color do you want to set for triangle:");
        String color = scanner.nextLine();

        System.out.println("Input 3 sides of triangle:");

        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {
            Triangle triangle = new Triangle(side1, side2, side3);
            triangle.setColor(color);
            System.out.println(triangle);
        } else System.out.println(" not 3 sides of triangle");


    }
}
