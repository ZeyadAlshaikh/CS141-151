package Tutorials.T5;

public class Circle extends TwoDimensionalShape{
    private double radius;
    private Point center;

    public Circle(double radius, Point center) {

        this.radius = radius;
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
    public void setCenterX(int x){
        this.center.setX(x);
    }

    public double getArea(){
        //(𝜋 ∗ 𝑟𝑎𝑑𝑖𝑢𝑠^2)
      return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference(){
        //(2 ∗ 𝜋 ∗ 𝑟𝑎𝑑𝑖𝑢𝑠)
        return  2 * Math.PI * radius;
    }

    @Override
    public  double getPerimeter() {
        return getCircumference();
    }
    public double distance(Circle another){
        return this.center.distance(another.center);
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ", center=" + center +
                ']';
    }
}
