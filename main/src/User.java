
// manages interactions with the user
//import java.net.SocketPermission;
import java.util.Scanner;
import java.util.ArrayList;

import Shapes.objects;

public class User {
    static Scanner scan = new Scanner(System.in);

    public static void main (String[] args) {
        // 
        int ans = 0;
        // list of objects to be displayed
        ArrayList <objects> obj = new ArrayList<objects>();

        while (!(ans == 6)) {
            ans = 0;
            menu();
            System.out.println("Enter your choice: ");
            ans = scan.nextInt();
            System.out.println("\n");S

            if (ans == 1) {
                // display toString of objs
            }
            else if (ans == 2) {
                // potentially edit details of obj
            }
            else if (ans == 3) {
                // add and customize objs
                String shape;
                
                System.out.println("Enter the shape you want to draw (rectangle, circle): "); 
                shape = scan.nextLine(); 
                if (shape.equals("rectangle"))
                {
                    int width, height;
                    System.out.println("Enter the width: ");
                    width = scan.nextInt(); 
                    
                    System.out.println("Enter the height: ");
                    height = scan.nextInt();
                    
                    // default placement would be center of the page
                    // rectangle x = rectangle(shape, width, height);
                }
                else if (shape.equals("circle")) {
                    int radius = 1;
                    int centerx = 0; 
                    int centery = 0; 
                    /*
                    System.out.println("Enter the x-coordinate for the center: ");
                    centerx = scan.nextInt();
                    System.out.println("Enter the y-coordinate for the center: ");
                    centery = scan.nextInt(); 
                    */
                }
                else {
                    System.out.println("Invalid");
                }
            }
            else if (ans == 4) {
                // remove an element from obj
            }
            else if (ans == 5) {
                // display graph and shapes
            }
            else if (ans == 6) {
                System.out.println("Thanks for using our scuffed program. Have a good day!\n");
            }
            else {
                System.out.println("Invalid input, please try again.\n");
            }
        }
    }

    public static void menu() {
        System.out.println("""
        -------------------------------
        |                             |
        |  1) View existing curves    |
        |  2) Edit existing curves    |
        |  3) Add curve               |
        |  4) Remove curve            |
        |  5) Display                 |
        |  6) Exit                    |
        |                             |
        -------------------------------
        """);
    }
} 