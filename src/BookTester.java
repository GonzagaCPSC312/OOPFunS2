

public class BookTester {
    // a tester class (AKA driver) is used for exercises programs
    public static void main(String[] args) {
        Book bookOne = new Book(); // DVC
        System.out.println(bookOne);

        Book bookTwo = new Book("The Hobbit", "Tolkein", 400); // EVC
        System.out.println(bookTwo); // implicitly calls toString()
        System.out.println(bookTwo.toString()); // explicitly calls toString()

        System.out.println(bookTwo.getTitle());


    }
}
