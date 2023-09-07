package Shapes;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Scanner;

public class objects_main {

    private static String shape; 
    private static int length; 
    private static objects d;
    static Scanner scan = new Scanner(System.in); 
    

    
    public static void main (String[] args){
         System.out.println("Enter the shape you want to draw: "); 
        shape = scan.nextLine(); 
        if (shape.equals("square"))
        {
            System.out.println("Enter the side length of the square: ");
            length = scan.nextInt(); 
            d = new objects(shape, length);
            Thread d_thread = new Thread((Runnable) d);
            d_thread.start();
        }
        int radius = 1;
        int centerx = 0; 
        int centery = 0; 
        System.out.println("Enter the x-coordinate for the center: ");
        centerx = scan.nextInt();
        System.out.println("Enter the y-coordinate for the center: ");
        centery = scan.nextInt(); 
 
        
        }
        
        

        
    
    
    public void paintComponent(Graphics g)
    {
        Graphics2D page = (Graphics2D) g;
        d.draw(page);
    }
    
}

