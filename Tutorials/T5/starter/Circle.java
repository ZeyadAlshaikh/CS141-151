public class Circle {
    private double radius;
    private Point center; 
    

    public Circle(String color, Point center,double radius) {
        this.center =  center;
        this.radius = radius;
        
    }

    

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }



    public void setCenter(Point center) {
        this.center = center;
    }
    
    public double getArea(){
        //(𝜋 ∗ 𝑟𝑎𝑑𝑖𝑢𝑠^2)
      return Math.PI * Math.pow(radius, 2);
    }

    
    public double getPerimeter(){
        //(2 ∗ 𝜋 ∗ 𝑟𝑎𝑑𝑖𝑢𝑠)
        return  2 * Math.PI * radius;
    }



    @Override
    public String toString() {
        return  "Circle[" +
                "radius=" + radius +
                ']';
    }



    
}
