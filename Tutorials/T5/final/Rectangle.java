package Tutorials.T5;

public class Rectangle extends TwoDimensionalShape{

    double lenght , width;

    public Rectangle(double lenght, double widht) {
       this.lenght = lenght;
       this.width = widht;
    }

    @Override
    public double getArea(){
        return  width * lenght;
    }

    @Override
    public double getPerimeter(){
        return  2* (lenght+ width);
    }
}
