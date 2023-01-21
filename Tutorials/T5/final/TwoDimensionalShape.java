public abstract class TwoDimensionalShape extends Shape{

    public TwoDimensionalShape(String color, Point position) {
        super(color, position);
    }

    @Override
    public String toString() {
        return super.toString()+  "\nTwoDimensionalShape []";
    }

    public double getPerimeter(){
        System.out.println("[TwoDimensionalShape] Perimeter Unknown!");
        return 0.0; 
    }
    
    @Override
    public double getArea(){
        System.out.println("[Shape] Area is unknown! ");
        return 0.0; 
    }
}
