/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jakeolst.projects.calculator;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author jarke
 */
public class calculatorGUI extends JFrame
{
    public calculatorGUI()
    {
        this.setTitle("Calculator");
        this.setLayout(new BorderLayout());
        add(new TopMenu(), BorderLayout.NORTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.setVisible(true);
    }
}
