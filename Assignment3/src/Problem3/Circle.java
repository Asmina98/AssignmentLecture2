package Problem3;

final class Circle {
    private final double radius;
    public static final double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}

