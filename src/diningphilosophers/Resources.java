/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package diningphilosophers;

import java.awt.*;
import java.io.*;
import javax.imageio.ImageIO;

/**
 *
 * @author Soup
 */
public class Resources {
    public static Image chopstick;
    public static Image ricebowl;
    public static Image eating;
    public static Image thinking;
    
    public static void init(){
        try {
            chopstick = ImageIO.read(new File("C:\\Users\\seeli\\Documents\\NetBeansProjects\\DiningPhilosophers\\src\\diningphilosophers\\Images\\Chopstick.jpg"));
            ricebowl = ImageIO.read(new File("C:\\Users\\seeli\\Documents\\NetBeansProjects\\DiningPhilosophers\\src\\diningphilosophers\\Images\\Ricebowl.png"));
            thinking = ImageIO.read(new File("C:\\Users\\seeli\\Documents\\NetBeansProjects\\DiningPhilosophers\\src\\diningphilosophers\\Images\\Thinking.jpg"));
            eating = ImageIO.read(new File("C:\\Users\\seeli\\Documents\\NetBeansProjects\\DiningPhilosophers\\src\\diningphilosophers\\Images\\Eating.png"));
        } catch (IOException e) {}
    }
}
