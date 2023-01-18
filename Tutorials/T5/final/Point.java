public class Point {

    private int x, y;
    // The constructors (overloaded)
    public Point() { // The no argument constructor
        this.x = 0;
        this.y = 0;
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return this.y;
    }
    public void setY(int y) {
        this.y = y;
    }
    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    // Return a 2-element int array containing x and y.
    public int[] getXY() {
        int[] results = new int[2];
        results[0] = this.x;
        results[1] = this.y;
        return results;
    }
    // Set both x and y.
    public void setXY(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    // Return the distance from this instance to the given point at (x,y).
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
        // Return the distance from this instance to the given Point instance (called another).
    public double distance(Point another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
}
    // Return the distance from this instance to (0,0).
    public double distance() {
        return Math.sqrt(this.x*this.x + this.y*this.y);
    }
}
