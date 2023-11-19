/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jakeolst.projects.calculator;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jarke
 */
public class TopMenu extends JPanel implements ActionListener
{
    private JMenuBar menuBar = new JMenuBar();
    
    private JMenu fileMenu = new JMenu("File");
    private JMenuItem quit = new JMenuItem("Quit");
    
    public TopMenu()
    {
        this.setLayout(new BorderLayout());
        
        this.quit.addActionListener(this);
        this.quit.setActionCommand("Quit");
        
        fileMenu.add(quit);

        // Add buttons to MenuBar.
        menuBar.add(fileMenu);
        
        this.add(menuBar, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) // ActionPerformed - listeners for action events (ie buttons being pressed)
    {

            // --- File Menu --- //

        if ("Quit".equals(e.getActionCommand()))
        {
            System.out.println("Quit button clicked.");
            int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit the application?", "Calculator", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.OK_OPTION)
            {
                System.out.println("Exit Confirmed.");
                System.exit(0);
            }
        }
    }
}

