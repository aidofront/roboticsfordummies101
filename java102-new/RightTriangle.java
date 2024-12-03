public class RightTriangle implements Shape {
    private final Point corner;
    private final double base;
    private final double height;

    public RightTriangle(Point corner, double base, double height) {
        this.corner = corner;
        this.base = base;
        this.height = height;
    }

    public double area() {
        return 0.5 * base * height;
    }

    public double perimeter() {
        return base + height + Math.sqrt(base * base + height * height);
    }
}