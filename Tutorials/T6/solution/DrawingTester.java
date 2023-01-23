public class DrawingTester {
    

    public static void main(String[] args) {
        

        Shape[] shapes = new Shape[2];
        
        //shapes[0] = new Shape("Red", new Point(3,2)); 
        
        //shapes[1] = new TwoDimensionalShape("Green", new Point(0,2));

        shapes[0] = new Circle("Black", new Point(0,0), 7);

        shapes[1] = new Triangle("Green", new Point(0,0), 4,6,6,7);

        Drawing dr = new Drawing(shapes);


        for( Shape curr : dr.getShapes()){
            System.out.println(curr.getClass().getSimpleName());
            System.out.println(curr);
            System.out.println(curr.getArea());
            if(curr instanceof TwoDimensionalShape)
            System.out.println(((TwoDimensionalShape)curr).getPerimeter());
        }

        // dr.updateShape(new Rectangle("Yellow", new Point(5,5), 4,7), 0);
        // dr.updateShape(new Square("Red", new Point(0,0), 10,10), 1);


        // System.out.println(((TwoDimensionalShape)dr.shapeAt(0)).getPerimeter());
        // System.out.println(dr.shapeAt(1));


    }
}
