import java.util.Arrays;

public class PointTester {
    public static void main(String[] args) {
        Point origin = new Point();

        Point p2 = new Point(3, -4);

        System.out.println(origin);
        System.out.println(origin.getX());

        // array of references
        Point[] points = new Point[5];
        // NO new point objects were not just made!!
        // we have to make them
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(i, i); // actually making a Point object here!!
        }
        // print out the points array
        // static toString of the Arrays class
        System.out.println(Arrays.toString(points)); // Arrays is a class name, not an
        // object reference name !!!

        // task 3: in this project...
        // create a Circle class and a CircleTester
        // Circle has a Point (center) and an double (radius)
        // "has-a" relationship -> Composition
        // "is-a" relationship -> Inheritance
    }
}