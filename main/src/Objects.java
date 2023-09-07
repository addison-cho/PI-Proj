
import java.awt.*;
import java.util.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class Objects{
    public static void main (String[] args){


        public  objects() {
            Thread t1 = new Thread(g1);
            t1.start();
        }

    }
    public void paintComponent(Graphics g)
    {
        Graphics2D page = (Graphics2D) g;
        
        //draws ground
        g1.draw(page);
    }


    public void nextFrame()
    { 
        repaint();
    }

    public void run()
    {
        
    }
}