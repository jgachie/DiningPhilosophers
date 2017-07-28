/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diningphilosophers;

import java.awt.*;

/**
 *
 * @author Soup
 */
public class Philosopher extends Thread{
    private int x;
    private int y;
    private final int WIDTH = 200;
    private final int LENGTH = 200;
    private final int EATING_TIME = 2000;
    private Table table;
    private Chopstick leftChop;
    private Chopstick rightChop;
    private Image state = Resources.thinking;
    
    public Philosopher(int xPos, int yPos, Chopstick left, Chopstick right, Table t){
        x = xPos;
        y = yPos;
        leftChop = left;
        rightChop = right;
        table = t;
    }
    
    @Override
    public void run(){
        while(true){
            try{
            changeImage("THINKING");
            table.repaint();
            leftChop.acquire();
            rightChop.acquire();
            changeImage("EATING");
            table.repaint();
            sleep(EATING_TIME);
            leftChop.release();
            rightChop.release();
            
            
            }
            catch (InterruptedException e){}
        }
    }
    
    private void changeImage(String change){
        switch(change.toUpperCase()){
            case "THINKING":
                state = Resources.thinking;
                break;
            case "EATING":
                state = Resources.eating;
                break;
        }
    }
    
    public void draw(Graphics g){
        g.drawImage(state, x, y, WIDTH, LENGTH, null);
    }
}
