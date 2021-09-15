public class CircleTester {
    public static void main(String[] args) {
        /**
         * Task #1
         * Create a Circle class
         * A Circle has the following fields
         * Center (a Point object, use the same Point class we derived in the last lesson)
         * Radius (a floating point value)
         * Include a default value constructor and an explicit value constructor
         * Include a toString() that returns a String representing this Circle object’s center and radius
         * Include getter and setter methods
         * Create a CircleTester class
         * Create a few Circle objects and exercise your Circle methods
         */
        Circle c1 = new Circle(3, 7, 4.5);
        System.out.println(c1);

        /**
         * Task #2
         * In CircleTester, create and initialize an array of 5 Circle objects.
         * Print out your array to ensure there are no null references in there!
         */
        Circle[] circles = new Circle[5];
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(i, i, i);
        }

        for (int i = 0; i < circles.length; i++) {
            System.out.println(circles[i]);
        }
    }
}