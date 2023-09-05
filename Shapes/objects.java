import java.util.Scanner;
import TurtleGraphics.Pen;

public class objects {
    Scanner scan = new Scanner(System.in);
    private int radius = 1;
    private int centerx = 0; 
    private int centery = 0; 
    public static voic main (String[] args){
        System.out.println("Enter the x-coordinate for the center: ")
        centerx = scan.nextInt();
        System.out.println("Enter the y-coordinate for the center: ")
        centery = scan.nextInt(); 
    }
    public void circle(Pen p){
        double side = 2.0 * Math.PI * radius / 120.0;
		p.up();
		p.move (centerx + radius, centery - side / 120.0);
		p.setDirection (90);
		p.down();
		for (int i = 0; i<120; i++)
		{
			p.move (side);
			p.turn(3);
		}
    }
}
