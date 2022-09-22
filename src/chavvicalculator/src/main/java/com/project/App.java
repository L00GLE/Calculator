package com.project;

import java.util.*;

/**
 * Calculator for Chavvi
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        Character command = '_';
        
        // loop until user quits
        while (command != 'q') {
            printMenu();
            System.out.print("Enter a command: ");
            command = menuGetCommand(scan);

            executeCommand(scan, command);
        }

        scan.close();
    }

    //
    // Menu Functions
    //
    private static void printMenuLine() {
        System.out.println(
            "........................................"
        );
    }

    private static void printMenuCommand(Character command, String desc) {
        System.out.printf("%s\t%s\n", command, desc);
    }

    // Prints the menu
    public static void printMenu() {
        printMenuLine();
        System.out.println("Chavvi's Calculator");
        printMenuLine();

        printMenuCommand('a', "Enter a value for A");
        printMenuCommand('b', "Enter a value for B");
        printMenuCommand('+', "Add");
        printMenuCommand('-', "Subtract");
        printMenuCommand('*', "Multiply");
        printMenuCommand('/', "Divide");
        printMenuCommand('q', "Quit");
        printMenuCommand('c', "Clear");


        printMenuLine();
    }

    // Get first character from input
    private static Character menuGetCommand(Scanner scan) {
        Character command = '_';

        String rawInput = scan.nextLine();

        if (rawInput.length() > 0) {
            rawInput = rawInput.toLowerCase();
            command = rawInput.charAt(0);
        }

        return command;
    }

    // Calculator functions
    private static Boolean executeCommand(Scanner scan, Character command) {
        Boolean success = true;

        switch (command) {
            case 'q':
            System.out.println("Thank you for using Chavvi's Calculator!");
            break;
            default:
            System.out.println("ERROR: Unknown Command");
            success = false;
        }

        return success;
    }
}
