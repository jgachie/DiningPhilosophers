/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diningphilosophers;

import java.awt.*;
import javax.swing.JPanel;

/**
 *
 * @author Soup
 */
public class Table extends JPanel{
    private Philosopher[] phils;
    private Chopstick[] chops;
    
    public Table(int size){
        setPreferredSize(new Dimension(1000, 1000));
        setBackground(Color.WHITE);
        phils = new Philosopher[5];
        chops = new Chopstick[5];
        
        chops[0] = new Chopstick(160, 100, this);
        chops[1] = new Chopstick(700, 100, this);
        chops[2] = new Chopstick(755, 625, this);
        chops[3] = new Chopstick(450, 750, this);
        chops[4] = new Chopstick(100, 625, this);
        
        phils[0] = new Philosopher(380, 25, chops[0], chops[1], this);
        phils[1] = new Philosopher(730, 375, chops[1], chops[2], this);
        phils[2] = new Philosopher(555, 725, chops[2], chops[3], this);
        phils[3] = new Philosopher(205, 725, chops[3], chops[4], this);
        phils[4] = new Philosopher(30, 375, chops[4], chops[0], this);
        
        for (Philosopher phil : phils){
            phil.start();
        }
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.drawImage(Resources.ricebowl, 375, 350, 200, 200, this);
        
        for (int i = 0; i < 5; i++){
            phils[i].draw(g);
            chops[i].draw(g);
        }
    }
    
}
