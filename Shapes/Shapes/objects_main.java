package Shapes;

import java.util.Scanner;

public class objects_main {

    
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
 
        System.out.println("Enter the shape you want to draw: "); 
        String shape = scan.nextLine(); 
        System.out.println("Enter the side length of the square: ");
        int length = scan.nextInt(); 
        objects d = new objects(shape, length);
        

        int radius = 1;
        int centerx = 0; 
        int centery = 0; 
        System.out.println("Enter the x-coordinate for the center: ");
        centerx = scan.nextInt();
        System.out.println("Enter the y-coordinate for the center: ");
        centery = scan.nextInt(); 
    }
    
}
