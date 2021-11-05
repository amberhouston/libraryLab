import java.util.ArrayList;

public class libraryLab {
    // Add the missing implementation to this class

    ArrayList<Book> books = new ArrayList<Book>();
    //variable type String, named address
    String address;

    public libraryLab() {
    }

    //Not sure what this.address does but I follow the pattern
    public libraryLab(String address) {
        this.address = address;
    }

    //add a book to the array list
    public void addBook(Book b) {
        books.add(b);
    }

    //Hours of operation for Library
    public static void printOpeningHours() {
        System.out.println("9:00AM - 5:00PM daily");
    }

    //Library addresses
    public void printAddress() {
        System.out.println(address);
    }

    //Check if book is available
    public void printAvailableBooks() {
		if(books.isEmpty()) {
			System.out.println("No book in catalog");
		}
		for(Book book: books)
		System.out.println(book.getTitle()); 
        // This "getTitle" has the angry red line and I can't figure out how to fix it
    }

    public void borrowBook(String title){
		for(Book book: books){
			if(title.equals(book.getTitle())){
				if(book.isBorrowed()){
					System.out.println("This book is being borrowed already.");
					return;
				}
				else{
					book.borrowed();
					System.out.println("You are now borrowing "+book.getTitle());
					return;
				}
			}
		}
		System.out.println("Book is not available.");
	}

    public void returnBook(String title) {
		for(Book book: books) {
			if(title.equals(book.getTitle())){
				book.returned();
				System.out.println("You have returned " + book.getTitle());
			}
		}
	}



    public static void main(String[] args) {
        // Create two libraries
        libraryLab firstLibrary = new libraryLab("10 Main St.");
        libraryLab secondLibrary = new libraryLab("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}