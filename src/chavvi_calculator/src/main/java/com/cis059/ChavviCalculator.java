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
    String choice = "";
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
        choice = sc.nextLine();  
        
        // check if input is a valid char type
        if (choice.length() != 1){
            System.out.println("ERROR: Unknown command");
        }
        // check if user input is valid character
        else if (choice.charAt(0) != 'a' && choice.charAt(0) != 'b' && choice.charAt(0) != '+' && choice.charAt(0) != '-' && choice.charAt(0) != '*' && choice.charAt(0) != '/' && choice.charAt(0) != 'c' && choice.charAt(0) != 'q') {
            System.out.println("ERROR: Unknown command");
        }

        // input a option
        // input a option
        else if (choice.charAt(0) == 'a') {
            //sc.nextLine();
            System.out.print("Enter a number: ");
			      String a_string;
            try {
              a_string = sc.nextLine();
              a = Float.parseFloat(a_string);
            }
            catch (NumberFormatException e) {
              System.out.println("ERROR: The value entered is not a floating point number");
            }
        }

        // input b option
        // input b option
        else if (choice.charAt(0) == 'b') {
            //sc.nextLine();
            System.out.print("Enter a number: ");
			      String b_string;
            try{
              b_string = sc.nextLine();
              b = Float.parseFloat(b_string);
            }
            catch (NumberFormatException e){
              System.out.println("ERROR: The value entered is not a floating point number");
            }
		}

        // + option
		else if (choice.charAt(0) == '+') {
			a = a + b;
		}

        // - option
		else if (choice.charAt(0) == '-') {
			a = a - b;
		}
        
        // * option
        else if (choice.charAt(0) == '*') {
			a = a * b;
		}

        // / option
        else if (choice.charAt(0) == '/') {
			if (b == 0) {
                System.out.println("ERROR: Unable to divide by 0");
			}
			else {
				a = a / b;
			}
		}

        // clear option 
        else if (choice.charAt(0) == 'c') {
			a = 0;
			b = 0;
		}

        // quit option
        else if (choice.charAt(0) == 'q') {
            sc.close();
            System.out.println("Thank you for using Chavvi Calculator");
		}
    } while (choice.equals("") || choice.charAt(0) != 'q');
    }

    // main function
    public static void main(String[] args )
    {
        menu();
    }

}
