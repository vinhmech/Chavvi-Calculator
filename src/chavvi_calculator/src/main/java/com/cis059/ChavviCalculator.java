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
    // function to check if input is float 
    public static boolean isFloat(String value) {
        int decimalPoint = 0;
        if ((value.charAt(0) < '0' || value.charAt(0) > '9') && value.charAt(0) != '.' && value.charAt(0) != '-') return false;
        if (value.charAt(0) == '.' && value.charAt(1) == '-') return false;
        for (int i = 1; i < value.length(); i++) {
            if ((value.charAt(i) < '0' || value.charAt(i) > '9') && value.charAt(i) != '.') {
                return false;
            }
            if (value.charAt(i) == '.') {
                decimalPoint++;
                if (decimalPoint > 1) return false;
            }
        }
        return true;
    }

    // print menu function
    public static void menu(){
    // create scanner object to take input
    Scanner sc = new Scanner(System.in);
    char choice;
    float a = 0;
    float b = 0;
    do{
        System.out.print("--------------------------------------------");
        System.out.print("\nChavvi Calc");
        System.out.print("\n--------------------------------------------");
        System.out.print(String.format("\nA = %.3f        B = %.3f", a , b));
        System.out.print("\n--------------------------------------------");
        System.out.print("\na      Enter a value for A");
        System.out.print("\nb      Enter a value for B");
        System.out.print("\n+      Add");
        System.out.print("\n-      Subtract");
        System.out.print("\n*      Multiply");
        System.out.print("\n/      Divide");
        System.out.print("\nc      Clear");
        System.out.print("\nq      Quit");
        System.out.print("\n--------------------------------------------");
        System.out.print("\nEnter a command: ");
        choice = sc.next().charAt(0);
            
        // check if user input is valid
        if (choice != 'a' && choice != 'b' && choice != '+' && choice != '-' && choice != '*' && choice != '/' && choice != 'c' && choice != 'q') {
            System.out.println("ERROR: Unknown command");
        }

        // input a option
        else if (choice == 'a') {
            sc.nextLine();
            System.out.print("Enter a number: ");
			String a_string;
            a_string = sc.nextLine();
			if (isFloat(a_string) == true) {
                a = Float.parseFloat(a_string);
			}
			else {
                System.out.println("ERROR: The value entered is not a floating point number");
			}
		}

        // input b option
        else if (choice == 'b') {
            sc.nextLine();
            System.out.print("Enter a number: ");
			String b_string;
            b_string = sc.nextLine();
			if (isFloat(b_string) == true) {
                b = Float.parseFloat(b_string);
			}
			else {
                System.out.println("ERROR: The value entered is not a floating point number");
			}
		}

        // quit option
        else if (choice == 'q') {
            System.out.println("Thank you for using Chavvi Calculator");
		}
    } while (choice != 'q');
    }

    // main function
    public static void main(String[] args )
    {
        menu();
    }

}
