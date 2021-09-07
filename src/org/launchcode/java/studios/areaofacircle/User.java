package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class User {
    public static Double getUserInput(Scanner input) {
        System.out.println("Enter a radius: ");

        String radius = input.nextLine();

        return Double.parseDouble(radius);
    }
}
