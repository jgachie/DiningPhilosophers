/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package diningphilosophers;

import java.util.concurrent.Semaphore;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Soup
 */
public class Chopstick extends Semaphore{
    private int x;
    private int y;
    private boolean inUse = false;
    private final int WIDTH = 100;
    private final int LENGTH = 200;
    private Table table;
    
    public Chopstick(int x, int y, Table table){
        super(1, true);
        
        this.x = x;
        this.y = y;
        this.table = table;
    }
    
    public void draw(Graphics g){
        g.drawImage(Resources.chopstick, x, y, WIDTH, LENGTH, null);
    }
}