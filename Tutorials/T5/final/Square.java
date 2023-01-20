public class Square extends Rectangle{


    public Square(String color, Point position, double length, double width) {
        super(color, position, length, width);
    }

    @Override
    public String toString() {
        return super.toString()+ "\nSquare []";
    }

    @Override
    public double getArea() {
        System.out.println("From class Square");
        return length * width;
    }

    @Override
    public double getPerimeter() {
        System.out.println("From class Square");
        return 2 * (length + width);
    }

    

    
    
}
