public class Circle {
    private Point center;
    private double radius;

    // DVC
    public Circle() {
        center = new Point();
        radius = 1.0;
    }

    // EVC
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    // EVC
    public Circle(int x, int y, double radius) {
        this.center = new Point(x, y);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // NESTED CLASSES
    // a class defined inside another class
    // outer class: these are not nested, "normal" classes we have been working with
    // outer classes can be public or package-private

    // 4 types of nested classes
    // 1. static nested class (we will make Point a static nested class of Circle)
    // 2. non-static nested class (AKA inner class)
    // 3. local inner class (non-static nested class defined inside a method)
    // 4. anonymous inner class (local inner class without a name)

}