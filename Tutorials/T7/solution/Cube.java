public final class Cube extends ThreeDimensionalShape
{
	 private double side;

    public Cube(Point position, String color, double side) {
        super(position, color);
		  this.side = side;
    }
    
	@Override
	public double getArea()
	{
		return 6 * side * side;
	}
   
	@Override
	public double getVolume()
	{
		return Math.pow(side,3);
	}
   
	 @Override
    public String toString() {
        return  String.format("Cube[%s, side=%.2f]", super.toString(), side);
    }
}
