public class Rectangle{

    protected double length, width;

    public Rectangle( double length, double width) {
        
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

    
    public double getArea() {
       
        return length * width;
    }

    
    public double getPerimeter() {
        
        return 2 * (length + width);
    } 
    

    

    
    
    
}
