public class Circle implements Shape {
    public final Point center;
    public final double radius;
public Circle(Point center, double radius) {
    this.center = center;
    this.radius = radius;
}

public double area() {
    return Math.PI * radius * radius;
}

public double perimeter() {
    return 2 * Math.PI * radius;
    }
}

public static Circle fromPoints(Point p1, Point p2, Point p3) {
    double x1 = p1.x, y1 = p1.y;
    double x2 = p2.x, y2 = p2.y;
    double x3 = p3.x, y3 = p3.y;

    double a = x1 * (y2 - y3) - y1 * (x2 - x3) + (x2 * y3 - x3 * y2);

    double x12 = x1 * x1 + y1 * y1;
    double x22 = x2 * x2 + y2 * y2;
    double x32 = x3 * x3 + y3 * y3;

    double centerX = (x12 * (y2 - y3) + x22 * (y3 - y1) + x32 * (y1 - y2)) / (2 * a);
    double centerY = (x12 * (x3 - x2) + x22 * (x1 - x3) + x32 * (x2 - x1)) / (2 * a);

    Point center = new Point(centerX, centerY);
    double radius = Point.distance(center, p1);
    return new Circle(center, radius);
 }
