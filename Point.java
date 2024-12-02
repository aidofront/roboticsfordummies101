package java102;

public class Point {
    public final double x;
    public final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    } 
    public Point translateX(double t) {
		return new Point(x + t, y);
	}
	
	public Point translateY(double t) {
		return new Point(x, y + t);
	}
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
    }
    public static double distance(Point p1, Point p2) {
		return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
	}
}

//center of mass practice
public static Point centerOfMass(Point[] points) {
    if (points == null || points.length == 0) {
        throw new IllegalArgumentException("The array of points must not be null or empty.");
    }

    double sumX = 0;
    double sumY = 0;

  
    for (Point p : points) {
        sumX += p.getX();
        sumY += p.getY();
    }

   
    double avgX = sumX / points.length;
    double avgY = sumY / points.length;

   
    return new Point(avgX, avgY);
}

//angle practice
public double angle (){
    double angleInRadians = Math.atan2(y,x);
    return Math.toDegrees(angleInRadians);
}

//returnAll practice
public static void returnAll(LibraryItem[] items) {
    for (LibraryItem item : items) {
        item.returnToLibrary();
    }
}
