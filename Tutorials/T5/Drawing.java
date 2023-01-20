package Tutorials.T5;

public class Drawing {

    private  Shape[] shaps;

    public Drawing(Shape[] shaps) {
        this.shaps = shaps;
    }

    public Shape[] getShaps() {
        return shaps;
    }

    public void setShaps(Shape[] shaps) {
        this.shaps = shaps;
    }


    public boolean updateShape(int index, Shape obj){
        if( index < shaps.length && index >=0)
        {
           shaps[index] = obj;
           return  true;
        }else
            return  false;
    }


    public Shape shapeAt(int index){
        if( index < shaps.length && index >=0)
        {
            return shaps[index] ;

        }else
            return  null;

    }

    public double getShapeArea(int index){
        if( index < shaps.length && index >=0)
        {
            return shaps[index].getArea() ;

        }else
            return  0.0;
    }
}
