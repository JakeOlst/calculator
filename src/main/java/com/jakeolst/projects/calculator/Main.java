/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jakeolst.projects.calculator;

import java.util.Scanner;

/**
 * @author jakeolst
 */
public class Main 
{
    public static void main(String[] args) 
    {
        // Create the singleton instance of the calculator
        Calculator calculator = Calculator.getCalculator();
                
        // Begin the calculator
        calculator.start();     
        
        
    }
}