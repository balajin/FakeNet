package ui.geometry;

public class LineSegment {

    private Point startingPoint;
    private Point endPoint;

    public LineSegment(Point startingPoint, Point endPoint) {
        this.startingPoint = startingPoint;
        this.endPoint = endPoint;
    }

    public int axesOfChange() {
        if (startingPoint.getXpos() != endPoint.getXpos()) {
            return 0;
        } else {
            return 1;
        }
    }

    public int scalarDistance() {
        if (0 == axesOfChange()) {
            return Math.abs(endPoint.getXpos() - startingPoint.getXpos());
        } else {
            return Math.abs(endPoint.getYpos() - startingPoint.getYpos());
        }
    }

    public Point pointAt(int length) {
        if (0 == axesOfChange()) {
            return new Point(startingPoint.getXpos() + length, startingPoint.getYpos());
        } else {
            return new Point(startingPoint.getXpos(), startingPoint.getYpos() + length(length));
        }
    }

    private int length(int length) {
        if (startingPoint.getYpos() < endPoint.getYpos())
            return length;
        else
            return -length;
    }
}
