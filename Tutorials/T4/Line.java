package Tutorials.T4;

public class Line {

    public Point start, end;


    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "Line[" +
                "begin=" + start.toString() +
                ", end=" + end +
                ']';
    }
}
