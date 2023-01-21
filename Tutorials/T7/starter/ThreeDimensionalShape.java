public abstract class ThreeDimensionalShape extends Shape implements Movable 
{
    public ThreeDimensionalShape(Point position, String color) {
        super(position, color);
    }
    
    public abstract double getVolume();

   

    @Override
    public void moveDown() {
        // TODO Auto-generated method stub
        getPosition().setY(getPosition().getY() -1);
        
    }

    @Override
    public void moveLeft() {
        // TODO Auto-generated method stub
        getPosition().setX(getPosition().getX() -1);
        
    }

    @Override
    public void moveRight() {
        // TODO Auto-generated method stub
        getPosition().setX(getPosition().getX() +1);
        
    }

    @Override
    public void moveUp() {
        // TODO Auto-generated method stub
        getPosition().setY(getPosition().getY() + 1);
    }
    
   
}
