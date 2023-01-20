package Tutorials.T5;

public class Triangle extends TwoDimensionalShape{

    double base, height, sideA, sideC;

    public Triangle(double sideA, double sideC, double base, double height) {

        this.base = base;
        this.height = height;
        this.sideA= sideA;
        this.sideC = sideC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", SideA=" + sideA +
                ", SideC=" + sideC +
                '}';
    }

    @Override
    public double getArea() {
        return 0.5 * ( base * height);
    }

    @Override
    public double getPerimeter() {
        return sideA + sideC + base;
    }
}
