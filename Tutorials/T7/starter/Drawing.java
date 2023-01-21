

public final class Drawing {
    
    private Shape[] shapes;
    
    public Drawing(Shape[] shapes)
    {
        this.shapes = shapes;
    }
    
    public Shape[] getShapes() {
        return shapes;
    }
    
    public boolean updateShape(Shape shape, int index) {
        if (index < 0 || index >= shapes.length)
            return false;
        shapes[index] = shape;
        return true;
    }
               
    public Shape shapeAt(int index) {
        if (index < 0 || index >= shapes.length)
            return null;
        return shapes[index];
    }
    
    public double getShapeArea(int index) {
        if (index < 0 || index >= shapes.length)
            return 0.0;
        return shapes[index].getArea();
    }
}
