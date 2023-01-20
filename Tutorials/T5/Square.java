package Tutorials.T5;

public class Square extends  TwoDimensionalShape{

    double side;
    public Square(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    public double getArea(){
        return  side* side;
    }

    public double getPerimeter(){
        return  4 * side;
    }
}
