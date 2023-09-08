import java.awt.Color;
package Shapes;

public class rectangle extends shapes_parent {

    private int width, height; 
    private String name = " "; 

    public square(String name, int width, height) {
        super(name);
        this.width = width;
        this.height = height;
        
    }

    public void draw(Graphics g)
	{ 
		g.setColor(Color.BLUE);
		g.drawLine(1, 1, 1+length, 1);
		g.drawLine(1+length, 1, 1+length, 1+length);
		g.drawLine(1+length, 1+length, 1, 1+length);
	}   
}
