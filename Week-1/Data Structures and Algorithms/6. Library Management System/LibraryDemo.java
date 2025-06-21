public class LibraryDemo {
    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "The Alchemist", "Paulo Coelho"),
            new Book(2, "To Kill a Mockingbird", "Harper Lee"),
            new Book(3, "1984", "George Orwell"),
            new Book(4, "Pride and Prejudice", "Jane Austen"),
            new Book(5, "The Great Gatsby", "F. Scott Fitzgerald")
        };

        // Linear Search
        String searchTitle1 = "1984";
        Book found1 = LibrarySearch.linearSearch(books, searchTitle1);
        System.out.println("Linear Search Result:");
        System.out.println(found1 != null ? found1 : "Book not found");

        // Binary Search
        String searchTitle2 = "The Great Gatsby";
        Book found2 = LibrarySearch.binarySearch(books, searchTitle2);
        System.out.println("\nBinary Search Result:");
        System.out.println(found2 != null ? found2 : "Book not found");
    }
}
