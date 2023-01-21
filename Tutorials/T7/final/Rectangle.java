public class Rectangle extends TwoDimensionalShape
{
    private double length;
    private double width;

    public Rectangle(Point position, String color, double length, double width) {
        super(position, color);
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double getArea() {
        return length * width;
    }
    
    @Override
    public final double getPerimeter() {
        return 2 * (length + width);
    }
    
    @Override
    public String toString() {
        return  String.format("Rectangle[length=%f, width=%f, %s]", 
                length, width, super.toString());
    }
    
    @Override
    public void resize(int percent) {
        this.length *= (double)percent/100;
        this.width   *= (double) percent/100;
    }
}
