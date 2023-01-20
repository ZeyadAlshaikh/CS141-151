public class Shape {
    
    protected String color; 
    protected Point position;

    public Shape(String color, Point position) {
        this.color = color;
        this.position = position;
    } 

    public double getArea(){
        System.out.println("[Shape] Area is unknown! ");
        return 0.0; 
    }

    @Override
    public String toString() {
        return "Shape [color=" + color + ", position=" + position + "]";
    }

    
    
}
