public class Circle extends TwoDimensionalShape{
    private double radius;
     
    

    public Circle(String color, Point position,double radius) {
        super(color, position);
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
        return  "Circle[" +
                "radius=" + radius +
                ']';
    }



    
}
