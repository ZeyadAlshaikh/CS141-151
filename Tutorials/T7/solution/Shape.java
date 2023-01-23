public abstract class Shape 
{
    private String color;
    private Point position;

    public Shape(Point position, String color) {
        this.color = color;
        this.position = position;
    }
    
    public Point getPosition() {
        return position;
    }
  
    public abstract double getArea();
    
    @Override
    public String toString() {
        return String.format("Shape[position=%s, color=%s]", position, color);
    }
}
