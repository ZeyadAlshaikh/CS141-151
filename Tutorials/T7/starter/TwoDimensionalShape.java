
public abstract class TwoDimensionalShape extends Shape implements Resizable
{
    public TwoDimensionalShape(Point position, String color) {
        super(position, color);
    }
    
    public abstract double getPerimeter();

    
}
