public class DrawingTester {
    public static void main(String[] args) {
        
        Shape[] shapes = new Shape[4];
        Shape s = new Shape("Red", new Point(0,0));
        TwoDimensionalShape td = new TwoDimensionalShape("Green", new Point(1,1));
        Circle cir  = new Circle("Green", new Point(1,1), 5);
        Triangle tr = new Triangle("Green", new Point(3,7), 10, 16 , 10, 10);

        shapes[0] = s; 
        shapes[1] = td;
        shapes[2] = cir;
        shapes[3] = tr; 


        Drawing dr = new Drawing(shapes);

        for(Shape curr: dr.getShapes()){
            System.out.println(curr);
            System.out.println(curr.getArea());
        }

        dr.updateShape(new Rectangle("Green", new Point(1,1), 10,7), 0);
        dr.updateShape(new Square("Green", new Point(1,1), 10,7), 1);

        System.out.println("------------------------");
        System.out.println(((TwoDimensionalShape)dr.shapeAt(0)).getPerimeter());
        System.out.println(dr.shapeAt(1));

    }
}
