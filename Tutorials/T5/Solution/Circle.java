package Tutorials.T5.final;

public class Circle extends TwoDimensionalShape{
    private double radius;
    

    public Circle(String color, Point center,double radius) {
        super(color, center);
        this.radius = radius;
        
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    
    @Override
    public double getArea(){
        //(𝜋 ∗ 𝑟𝑎𝑑𝑖𝑢𝑠^2)
      return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter(){
        //(2 ∗ 𝜋 ∗ 𝑟𝑎𝑑𝑖𝑢𝑠)
        return  2 * Math.PI * radius;
    }



    @Override
    public String toString() {
        return super.toString() + "\nCircle[" +
                "radius=" + radius +
                ']';
    }
}
