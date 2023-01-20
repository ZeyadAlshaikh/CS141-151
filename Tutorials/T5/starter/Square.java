public class Square {

    private double side; 
    public Square( double side) {
        this.side = side; 
    }

    @Override
    public String toString() {
        return "Square []";
    }

    
    public double getArea() {
        
        return side * side;
    }

   
    public double getPerimeter() {
       
        return 4 * side;
    }

    

    
    
}
