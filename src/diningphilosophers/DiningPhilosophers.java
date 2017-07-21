/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diningphilosophers;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Soup
 */
public class DiningPhilosophers{
    
    public static void main(String[] args) {
        //Initialize images into Image objects
        Resources.init();
        
        //Set up window
        JFrame window = new JFrame("Dining Philosophers");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setPreferredSize(new Dimension(1000, 1000));
        
        //Create 
        Table table = new Table(1000);
        window.getContentPane().add(table);
        window.pack();
        window.setVisible(true);
    }
}