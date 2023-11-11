/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.jakeolst.projects.calculator;

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
        // Leave empty - 'lazy implementation' prevents instantiation
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
    
    public static int doAdd(int num1, int num2)
    {
        return num1+num2;
    }
    
    public static int doSubtract(int num1, int num2)
    {
        return num1-num2;
    }
    
    public static int doMultiply(int num1, int num2)
    {
        return num1*num2;
    }
    
    public static int doDivide(int num1, int num2)
    {
        return num1/num2;
    }
    
    @Override
    public String toString()
    {
        return "This is a Calculator.";
    }
    
}
