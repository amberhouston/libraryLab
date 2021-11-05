public class Book {

    private String title;
    private boolean borrowed;

    // Create a new Book
    public Book(String bookTitle) {

        this.title = bookTitle;
        this.borrowed = false;
    }

    // boolean method for when book is rented out and returned
    public void borrowed() {
        borrowed = true;
    }

    public void returned() {
        borrowed = false;
    }

    // Checks if book is checked out
    public boolean isBorrowed() {
        return borrowed;
    }

    // Gets title of the book
    public String getTitle() {
        return title;
    }

    public static void main(String[] arguments) {

    // Step 1
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.borrowed();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }
}
