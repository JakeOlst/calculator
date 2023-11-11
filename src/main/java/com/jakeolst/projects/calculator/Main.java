/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jakeolst.projects.calculator;

/**
 * @author jakeolst
 */
public class Main 
{
    public static void main(String[] args) 
    {
        Calculator calculator = Calculator.getCalculator();
        System.out.println(calculator);
        
        System.out.println(calculator.doAdd(1,2));
        System.out.println(calculator.doSubtract(2,1));
        System.out.println(calculator.doMultiply(10,5));
        System.out.println(calculator.doDivide(10,5));
        
    }
}