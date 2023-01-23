public class Circle extends TwoDimensionalShape 
{
    private double radius;

    public Circle(Point position, String color, double radius) {
        super(position, color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }
    
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    @Override
    public String toString() {
        return  String.format("Circle[radius=%f, %s]", radius, super.toString());
    }

    
    
    
}
