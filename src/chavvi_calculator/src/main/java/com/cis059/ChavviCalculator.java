/** 
 * Copyright Notice
 * Filename: ChavviCalculator.java
 */

package com.cis059;
import java.util.Scanner;  // Import the Scanner class
/** 
 * Create a calculator
 * @author Vinh Nguyen - SJCC_CIS059
 * @version 1.0 - 08/21/2021
 */

public class ChavviCalculator 
{
    // print menu function
    public static void menu(){
        // create scanner object to take input
        Scanner sc = new Scanner(System.in);
        float a = 0;
        float b = 0;
        char choice;
        System.out.println("--------------------------------------------");
        System.out.println("\nChavvi Calc");
        System.out.println("\n------------------------------------------");
        System.out.println("\n------------------------------------------");
        System.out.println(String.format("\nA = %.3f        B = %.3f", a , b));
        System.out.println("\n------------------------------------------");
        System.out.println("\na      Enter a value for A");
        System.out.println("\nb      Enter a value for B");
        System.out.println("\n+      Add");
        System.out.println("\n-      Subtract");
        System.out.println("\n*      Multiply");
        System.out.println("\n/      Divide");
        System.out.println("\nc      Clear");
        System.out.println("\nq      Quit");
        System.out.println("\n------------------------------------------");
        System.out.print("\nEnter a command: ");
        choice = sc.next().charAt(0);
            
        // check if user input is valid
        if (choice != 'a' && choice != 'b' && choice != '+' && choice != '-' && choice != '*' && choice != '/' && choice != 'c' && choice != 'q') {
            System.out.println("ERROR: Unknown command");
        }
    }



    // main function
    public static void main( String[] args )
    {
        menu();
        System.out.println( "Hello World!" );
    }

}
