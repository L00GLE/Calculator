package com.project;

import java.util.*;

/**
 * Calculator for Chavvi
 *
 */

public class App 
{
    public static void main( String[] args ) {

        char function;

        double num1 = 0.000;
        double num2 = 0.000;
        double result = 0.000;

        Scanner scan = new Scanner(System.in);

        

        // Program in loop
        while (true) {


            // Menu
            System.out.println("");
            System.out.println("Chavvi's Calcuator");
            System.out.println("..............................");
            System.out.println("a   Enter values for A");
            System.out.println("b   Enter values for B");
            System.out.println("+   Add");
            System.out.println("-   Subtract");
            System.out.println("*   Multiply");
            System.out.println("/   Divide");
            System.out.println("c   Clear");
            System.out.println("q   Quit");
            System.out.println("..............................");
            System.out.println("A = " + num1 + "    B = " + num2);
            System.out.println("..............................");
            System.out.print("Enter a function: ");
    
    
            function = scan.next().charAt(0);

            // Calculator Functions
            switch (function) {
    
                case 'a':
                System.out.println("Please enter a value for A: ");
                num1 = scan.nextDouble();
                System.out.println("A = " + num1);
                break;

                case 'b':
                System.out.println("Please enter a value for B: ");
                num2 = scan.nextDouble();
                System.out.println("B = " + num2);
                break;

                case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
                
                case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
    
                case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
    
                case '/':
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;
    
                case 'c':
                num1 = 0;
                num2 = 0;
                System.out.println("Your values have been reset");
                break;
    
                default:
                System.out.println("ERROR Unknown Function!");
                break;
    
                case 'q':
                System.out.print("Thank you for using Chavvi's Calculator!");
                return;
            }
        }
    }
}