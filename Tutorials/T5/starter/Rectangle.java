public class Rectangle extends TwoDimensionalShape{

    protected double length, width;

    public Rectangle(String color, Point position, double length, double width) {
        super( color,  position);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return  "Rectangle [length=" + length + ", width=" + width + "]";
    }

    @Override
    public double getArea() {
       
        return length * width;
    }

    @Override
    public double getPerimeter() {
        
        return 2 * (length + width);
    } 
    

    

    
    
    
}
