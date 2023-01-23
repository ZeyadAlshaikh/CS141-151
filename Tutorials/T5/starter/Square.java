public class Square extends Rectangle{

    
    public Square(String color, Point position, double length, double width ) {
        super(color, position, length,width);
        
    }

    @Override
    public String toString() {
        return "Square []"+super.toString();
    }


    
}
