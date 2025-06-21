public class InventorySystem {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Products were added here
        Product p1 = new Product(101, "Keyboard", 50, 1000.0);
        Product p2 = new Product(102, "Mouse", 30, 250.0);
        Product p3 = new Product(103, "Mobile", 20, 1000.0);
        Product p4 = new Product(104, "Charger", 10, 500.0);

        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);
        inventory.addProduct(p4);

        // Product Updation
        inventory.updateProduct(101, 60, 300.0);
        inventory.updateProduct(102, 20, 200.0);

        // Deletion of non required product is done here
        inventory.deleteProduct(103);

        //After deletion remaining products will be displayed using this
        inventory.displayAllProducts();
    }
}