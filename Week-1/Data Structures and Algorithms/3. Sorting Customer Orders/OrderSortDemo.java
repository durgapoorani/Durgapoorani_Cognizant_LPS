public class OrderSortDemo {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(201, "Alice", 1500.0),
            new Order(202, "Bob", 800.0),
            new Order(203, "Charlie", 3000.0),
            new Order(204, "David", 2000.0),
            new Order(205, "Eva", 1200.0)
        };

        System.out.println("Before Sorting:");
        for (Order o : orders) {
            System.out.println(o);
        }

        // SortAlgorithms.bubbleSort(orders);
        SortAlgorithms.quickSort(orders, 0, orders.length - 1);

        System.out.println("\nAfter Sorting by totalPrice:");
        for (Order o : orders) {
            System.out.println(o);
        }
    }
}
