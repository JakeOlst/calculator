/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.jakeolst.projects.calculator;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author jarke
 */
public class CalculatorTest 
{

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }
    
    /**
     * Test of getCalculator method, of class Calculator.
     */
    @org.junit.jupiter.api.Test
    public void testGetCalculator() 
    {
        System.out.println("getCalculator");
        Calculator expResult = Calculator.getCalculator();
        Calculator result = Calculator.getCalculator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of doAdd method, of class Calculator.
     */
    @org.junit.jupiter.api.Test
    public void testDoAdd() 
    {
        System.out.println("doAdd");
        int num1 = 10;
        int num2 = 5;
        int expResult = 15;
        int result = Calculator.doAdd(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of doSubtract method, of class Calculator.
     */
    @org.junit.jupiter.api.Test
    public void testDoSubtract() 
    {
        System.out.println("doSubtract");
        int num1 = 10;
        int num2 = 5;
        int expResult = 5;
        int result = Calculator.doSubtract(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of doMultiply method, of class Calculator.
     */
    @org.junit.jupiter.api.Test
    public void testDoMultiply() 
    {
        System.out.println("doMultiply");
        int num1 = 10;
        int num2 = 5;
        int expResult = 50;
        int result = Calculator.doMultiply(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of doDivide method, of class Calculator.
     */
    @org.junit.jupiter.api.Test
    public void testDoDivide() 
    {
        System.out.println("doDivide");
        int num1 = 10;
        int num2 = 5;
        int expResult = 2;
        int result = Calculator.doDivide(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Calculator.
     */
    @org.junit.jupiter.api.Test
    public void testToString() 
    {
        System.out.println("toString");
        Calculator instance = Calculator.getCalculator();
        String expResult = "This is a Calculator.";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
