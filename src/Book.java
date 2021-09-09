

public class Book {
    // class:  a collection of state and behavior that completely
    // describes something
    // state: fields (AKA attributes)
    // behavior: methods

    // object: an instance of a class
    // a class is a like a blueprint, an object/instance is a realization
    // of the blueprint

    // state (fields)
    private String title;
    private String author;
    private int numPages;

    // constructors
    // we get a free default value constructor (DVC)

    // we can make our own constructors
    // explicit value constructors (EVC) can be used
    // to parameterize initialization values
    // (members of a class: fields, methods, constructors, nested classes...)
    public Book(String title, String paramAuthor, int paramNumPages) {
        // this is non-static, meaning we have this reference
        // this refers to the invoking object
        // in a constructor, this refers to the object being created
        this.title = title; // shadowing: title the parameter has the same name as title the field
        this.author = paramAuthor;
        this.numPages = paramNumPages;
    }
    // when we define our own constructor we lose the DVC
    public Book() {
        title = "BLANK TITLE";
        author = "BLANK AUTHOR";
        numPages = -1;
    }

    // recall: Object is the direct or indirect superclass of every class
    // Object has some useful methods, toString()
    // toString() returns a string representation of an object
    // we can override the one we inherit from Object

    // annotation: metainformation used by the IDE and compiler
    // doesn't affect source
    // @Deprecated @SuppressWarnings etc.
    @Override
    public String toString() {
        // BUILD a string a return it
        // DO NOT print out strings here
        // can use this!!
        return this.title + " by " + author;
    }
    // rule of thumb (data encapsulation): make everything private unless you can justify otherwise
    // getters and setters
    // 1. public: accessible anywhere
    // 2. package-private: accessible anywhere in the package
    // 3. protected: package-private plus accessible from a subclass, even on outside of the package
    // 4. private: accessible only within this class

    // getter (AKA accessor)
    public String getTitle() {
        return title;
    }
    // setter (AKA mutator)
    public void setTitle(String newTitle) {
        title = newTitle; // might want to do some validation first (perhaps return true/false)
    }
    // add getters and setters for our other 2 fields


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    // tasks
    // #1: create a Point class and a PointTester
    // Point represents a point in 2D space
    // x and y
    // toString() example: (0, 0)
    // exercise some constructors and methods in PointTester

    // #2: create a Circle class and a CircleTester
    // composition: "has-a" relationship
    // Circle has a center (Point) and a radius (double)
    // inheritance: "is-a" relationship

}
