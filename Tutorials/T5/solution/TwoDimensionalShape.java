<<<<<<< HEAD
public abstract class TwoDimensionalShape extends Shape{
=======
public class TwoDimensionalShape extends Shape{
>>>>>>> 8a4f69aac798f11397f8550ec42a339cc7f74abd

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
