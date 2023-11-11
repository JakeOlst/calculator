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
    
    @Override
    public String toString()
    {
        return "This is a Calculator.";
    }
    
    public static void main(String[] args) 
    {
    }
}
