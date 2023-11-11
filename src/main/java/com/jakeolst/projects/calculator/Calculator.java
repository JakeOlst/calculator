/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.jakeolst.projects.calculator;

import java.util.Scanner;

/**
 * @author jakeolst
 */

class Calculator 
{
    // Static reference of Calculator - allows only one to be used.
    private static Calculator calculator;
    
    // private constructor - 'lazy implementation' to prevent instantiation from outside of class (true singleton).
    private Calculator()
    {
        // Leave empty but defined as private - 'lazy implementation' prevents instantiation
    }
    
    // Creates calculator if doesn't exist, returns the new or active instance
    public static Calculator getCalculator()
    {
        if (calculator == null)
        {
            calculator = new Calculator();
        }
        return calculator;
    }
    
    // 'Main' part of the program - begins the calculator and its functions.
    public int start()
    {
        Scanner optionScanner = new Scanner(System.in);
        int output = 0;
        
        // Output message for the user to input calculator function choice
        // Usage: 'ADD' or 'SUBTRACT' or 'MULTIPLY' or 'DIVIDE'.
        System.out.println("Please select a Calculator Function from the list below:");
        System.out.println("ADD\n SUBTRACT\n MULTIPLY\n DIVIDE");

        String userSelection = optionScanner.nextLine().toUpperCase();
        
        // Checks if the calculator function is one which requires two inputs.
        if ((userSelection.equals("ADD")) || (userSelection.equals("SUBTRACT")) || (userSelection.equals("MULTIPLY")) || (userSelection.equals("DIVIDE")))
        {
            // Requests first integer for function
            System.out.println("Please enter the first number to "+userSelection);
            int num1 = optionScanner.nextInt();
            
            // Requests second integer for function
            System.out.println("Please enter the second number to "+userSelection);
            int num2 = optionScanner.nextInt();
            
            // Performs (via doAdd function), prints and returns addition of the two numbers
            if (userSelection.equals("ADD"))
            {
                output = calculator.doAdd(num1,num2);
                System.out.println(num1 + " + " + num2 + " = "+output);
            }
            
            // Performs (via doSubtract function), prints and returns subtraction of the two numbers
            else if (userSelection.equals("SUBTRACT"))
            {
                output = calculator.doSubtract(num1,num2);
                System.out.println(num1 + " - " + num2 + " = "+output);
            }
            
            // Performs (via doMultiply function), prints and returns multiplication of the two numbers
            else if (userSelection.equals("MULTIPLY"))
            {
                output = calculator.doMultiply(num1,num2);
                System.out.println(num1 + " * " + num2 + " = "+output);
            }
            
            // Performs (via doDivide function), prints and returns division of the two numbers
            else if (userSelection.equals("DIVIDE"))
            {
                System.out.println(num1 + " / " + num2 + " = "+output);
            }
        }
        return output;
    }
    
    // Adds num1 and num2 together
    public static int doAdd(int num1, int num2)
    {
        return num1+num2;
    }
    
    // Subtracts num2 from num1
    public static int doSubtract(int num1, int num2)
    {
        return num1-num2;
    }
    
    // Multiplies num1 with num2
    public static int doMultiply(int num1, int num2)
    {
        return num1*num2;
    }
    
    // Divides num1 by num2
    public static int doDivide(int num1, int num2)
    {
        return num1/num2;
    }
    
    // Prints out what the program is for, in case printed directly.
    @Override
    public String toString()
    {
        return "This is a Calculator.";
    }
    
}
