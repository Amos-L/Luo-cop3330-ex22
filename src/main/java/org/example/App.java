/*
 *  UCF COP3330 Fall 2021 Assignment 1.22 Solution
 *  Copyright 2021 Amos Luo
 */

package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int num1;
        int num2;
        int num3;

        System.out.printf("Enter the first number: "); //Getting user input
        Scanner x = new Scanner(System.in);
        num1 = x.nextInt(); //Storing user input
        System.out.printf("Enter the second number: ");
        num2 = x.nextInt();
        System.out.printf("Enter the third number: ");
        num3 = x.nextInt();

        if ((num1 == num2) || (num1 == num3) || (num2 == num3)) {
            System.out.printf("All numbers are the same.");
            return;
        } else if ((num1 > num2) && (num1 > num3))
            System.out.printf("The largest number is %d. ", num1);
        else if ((num2 > num1) && (num2 > num3))
            System.out.printf("The largest number is %d. ", num2);
        else if ((num3 > num1) && (num3 > num2))
            System.out.printf("The largest number is %d. ", num3);
    }
}