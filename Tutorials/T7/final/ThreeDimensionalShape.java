public abstract class ThreeDimensionalShape extends Shape implements Movable
{
    public ThreeDimensionalShape(Point position, String color) {
        super(position, color);
    }
    
    public abstract double getVolume();
    
    public void moveUp() {
        getPosition().setY(getPosition().getY()-1);
    }
    
    public void moveDown() {
        getPosition().setY(getPosition().getY()+1);
    }
    
    public void moveRight() {
        getPosition().setX(getPosition().getX()+1);
    }
    
    public void moveLeft() {
        getPosition().setX(getPosition().getX()-1);
    }
}
