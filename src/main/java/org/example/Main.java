package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);

        System.out.print("Enter membership status (Regular, VIP, Premium): ");
        String membershipInput = scannerObj.next();

        System.out.print("Enter age: ");
        int ageInput = scannerObj.nextInt();

        if (membershipInput.equalsIgnoreCase("Regular")) {
            if (ageInput < 18) {
                System.out.printf("Price: $%,.2f", 50.00);
            }
            if (ageInput >= 18 && ageInput <= 64) {
                System.out.printf("Price: $%,.2f", 100.00);
            }
            if (ageInput > 64) {
                System.out.printf("Price: $%,.2f", 75.00);
            }
        } else if (membershipInput.equalsIgnoreCase("VIP")) {
            if (ageInput < 18) {
                System.out.printf("Price: $%,.2f", 75.00);
            }
            if (ageInput >= 18 && ageInput <= 64) {
                System.out.printf("Price: $%,.2f", 150.00);
            }
            if (ageInput > 64) {
                System.out.printf("Price: $%,.2f", 112.5);
            }
        } else if (membershipInput.equalsIgnoreCase("Premium")) {
            if (ageInput < 18) {
                System.out.printf("Price: $%,.2f", 100.00);
            }
            if (ageInput >= 18 && ageInput <= 64) {
                System.out.printf("Price: $%,.2f", 200.00);
            }
            if (ageInput > 64) {
                System.out.printf("Price: $%,.2f", 150.00);
            }
        }
        else {
            System.out.println("Invalid membership status entered.");
        }

        //  close the scanner object
        scannerObj.close();
    }
}