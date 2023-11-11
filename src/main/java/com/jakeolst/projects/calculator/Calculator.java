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
    private String calcOptions = (" ADD \n SUBTRACT \n MULTIPLY \n DIVIDE");
    
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
    public void start()
    {
        boolean running = true;
        Scanner optionScanner = new Scanner(System.in);
        Scanner numScanner = new Scanner(System.in);
        double sessionSum = 0;
        
        String userSelection;

        // Requests first integer for function
        System.out.println("Please enter a number");
        int num = numScanner.nextInt();
        sessionSum += num;
        
        while (running)
        {
            userSelection = null;
            System.out.println("Please TYPE a Calculator Function from the list below:");
            System.out.println(" ADD \n SUBTRACT \n MULTIPLY \n DIVIDE \n TOTAL");
            while (userSelection == null)
            {
                userSelection = optionScanner.nextLine().toUpperCase();
            }            
            
            while (!userSelection.equals("ADD") && !userSelection.equals("SUBTRACT") && !userSelection.equals("MULTIPLY") && !userSelection.equals("DIVIDE")  && !userSelection.equals("TOTAL"))
            {
                System.out.println("Incorrect Input. Did not recognise '"+userSelection+"' as a valid option.");
                System.out.println("Please TYPE a Calculator Function from the list below:");
                System.out.println(" ADD \n SUBTRACT \n MULTIPLY \n DIVIDE \n TOTAL ");
                userSelection = optionScanner.nextLine().toUpperCase();
            }

            if (userSelection.equals("TOTAL"))
            {
                System.out.println("Total = "+sessionSum);
                System.out.printf("Total (3dp) = %.3f%n", sessionSum);
                running = !running;
            }
            
            // Requests integer for function
            if (running)
            {
                System.out.println("Please enter a number");
                num = numScanner.nextInt();
            
            
                if (userSelection.equals("ADD"))
                {
                    sessionSum = calculator.doAdd(sessionSum,num);
                }
                else if (userSelection.equals("SUBTRACT"))
                {
                    sessionSum = calculator.doSubtract(sessionSum,num);
                }
                else if (userSelection.equals("MULTIPLY"))
                {
                    sessionSum = calculator.doMultiply(sessionSum,num);
                }
                else if (userSelection.equals("DIVIDE"))
                {
                    sessionSum = calculator.doDivide(sessionSum,num);
                }
                else
                {
                    System.out.println("Unexpected Error.");
                    running = false;
                }
            }
            
        }
        optionScanner.close();
        numScanner.close();
    }
    
    // Adds num1 and num2 together
    public static double doAdd(double runningTotal, int inpNum)
    {
        return runningTotal+inpNum;
    }
    
    // Subtracts num2 from num1
    public static double doSubtract(double runningTotal, int inpNum)
    {
        return runningTotal-inpNum;
    }
    
    // Multiplies num1 with num2
    public static double doMultiply(double runningTotal, int inpNum)
    {
        return runningTotal*inpNum;
    }
    
    // Divides num1 by num2
    public static double doDivide(double runningTotal, int inpNum)
    {
        return runningTotal/inpNum;
    }
    
    // Prints out what the program is for, in case printed directly.
    @Override
    public String toString()
    {
        return "This is a Calculator.";
    }
    
}
