package org.launchcode.java.studios.areaofacircle;


import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double radiusDouble = -1.0;

        while (radiusDouble < 0) {
            radiusDouble = User.getUserInput(input);
        }

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter a radius: ");
//
//        String radius = input.nextLine();
//
//        input.close();
//
//        Double radiusDouble = Double.parseDouble(radius);
//
//        while (radiusDouble < 0) {
//            System.out.println("Enter a radius: ");
//
//            radius = input.nextLine();
//
//            input.close();
//
//            radiusDouble = Double.parseDouble(radius);
//        }

        Double area = Circle.getArea(radiusDouble);

        System.out.println("The area of a circle of radius " + radiusDouble + " is: " + area);
    }
}

