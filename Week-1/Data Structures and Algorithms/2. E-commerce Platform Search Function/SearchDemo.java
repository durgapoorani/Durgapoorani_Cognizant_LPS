public class SearchDemo {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shirt", "Clothing"),
            new Product(103, "Book", "Stationery"),
            new Product(104, "Mobile", "Electronics"),
            new Product(105, "Pen", "Stationery")
        };

        // Linear Search is Happening Here
        System.out.println("Linear Search for 'Book':");
        Product result1 = SearchAlgorithms.linearSearch(products, "Book");
        System.out.println(result1 != null ? result1 : "Product not found");

        // Binary Search is Happening Here
        System.out.println("\nBinary Search for 'Mobile':");
        Product result2 = SearchAlgorithms.binarySearch(products, "Mobile");
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}
