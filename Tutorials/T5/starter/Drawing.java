import java.util.Arrays;

public class Drawing {
    private Shape[] shapes;

    public Drawing(Shape[] shapes) {
        this.shapes = shapes;
    }

    public Shape[] getShapes() {
        return shapes;
    }

    public void setShapes(Shape[] shapes) {
        this.shapes = shapes;
    }


    public boolean updateShape(Shape shape, int index){
        if(index >=0 && index < shapes.length){
            shapes[index] = shape;
            return true;
        }else
        return false; 

    }

    public Shape shapeAt(int index){
        if(index >=0 && index < shapes.length){
            return shapes[index];
           
        }else
        return null;
    }


    public double getShapeArea(int index){
        if(index >=0 && index < shapes.length){
            return shapes[index].getArea();
           
        }else
        return 0.0;
    }


    @Override
    public String toString() {
        return "Drawing [shapes=" + Arrays.toString(shapes) + "]";
    } 

    

    
}
