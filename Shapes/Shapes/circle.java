package Shapes;

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
        this.name = name; 
        this.radius = radius; 
        this.centerx = centerx;
        this.centery = centery;
    }
    
}
