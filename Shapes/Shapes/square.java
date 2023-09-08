import java.awt.Color;
package Shapes;

public class square extends shapes_parent {

    private int length = 0; 
    private String name = " "; 

    public square(String name, int length) {
        super(name);
        
    }

    public void draw(Graphics g)
	{ 
		g.setColor(Color.BLUE);
		g.drawLine(1, 1, 1+length, 1);
		g.drawLine(1+length, 1, 1+length, 1+length);
		g.drawLine(1+length, 1+length, 1, 1+length);
	}   
}
