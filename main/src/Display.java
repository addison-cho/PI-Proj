
import javax.swing.JFrame;
import java.awt.*;
import Objects;

public class Display
{
   
    public static void main(String[] args) throws InterruptedException
    {
        JFrame frame1 = new JFrame();
        
        //sets the size for width and height of the frame
        frame1.setSize(700, 485);
        frame1.setTitle("Graphing user interface");
        frame1.setBackground(new Color(200, 200, 200));
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //holds all of my drawings
        objects row1 = new objects();
        frame1.add(row1);
        frame1.setVisible(true);
        
       
       
    }
}