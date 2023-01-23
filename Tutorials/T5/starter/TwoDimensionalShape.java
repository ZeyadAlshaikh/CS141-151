public class TwoDimensionalShape extends Shape{

    

  

    public TwoDimensionalShape(String color, Point position) {
        super(color, position);
    }

    @Override
    public String toString() {
        return  "TwoDimensionalShape []";
    }

    public double getPerimeter(){
        System.out.println("[TwoDimensionalShape] Perimeter Unknown!");
        return 0.0; 
    }
    
    @Override
    public double getArea(){
        System.out.println("[TwoDimensionalShape] Area Unknown!");
        return 0.0; 
    }
    
    
}
