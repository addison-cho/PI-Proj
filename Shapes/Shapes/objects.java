package Shapes;
import java.util.Scanner;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class objects extends JPanel {

	String shape = " "; 
	int length = 0; 
	public objects(String shape, int length)
	{
		this.shape = shape; 
		this.length = length; 
	}

	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		draw(g2); 
		
	}

	public void draw(Graphics g)
	{
		if (shape == "square"); 
			this.setBackground(Color.WHITE); 

			g.setColor(Color.BLUE);
			g.drawLine(1, 1, 1+length, 1);
			g.drawLine(1+length, 1, 1+length, 1+length);
			g.drawLine(1+length, 1+length, 1, 1+length);
	}
	

	/* 
    public void circle(Pen p, centerx, centery){
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
	*/
}
