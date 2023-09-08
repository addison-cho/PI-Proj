package Shapes;
import java.awt.Color;

public class circle extends shapes_parent{

    private String name; 
    private int radius = 1; 
    int centerx = 0; 
    int centery = 0; 

    public circle(String name){
        super(name);

    }
    public circle(String name, int radius, int centerx, int centery)
    {
        super(name); 
        this.radius = radius; 
        this.centerx = centerx;
        this.centery = centery;
    }
    
    public void draw(Graphics g)
	{ 
		g.setColor(Color.BLUE);
		g.drawOval(centerx, centery, radius, radius);
	}

}
