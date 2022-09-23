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
        }
    }
    }
}