import java.util.HashMap;

public class Inventory {
    HashMap<Integer, Product> productMap;

    public Inventory() {
        productMap = new HashMap<>();
    }

    public void addProduct(Product p) {
        productMap.put(p.productId, p);
        System.out.println("Product added: " + p.productName);
    }

    public void updateProduct(int productId, int newQuantity, double newPrice) {
        if (productMap.containsKey(productId)) {
            Product p = productMap.get(productId);
            p.quantity = newQuantity;
            p.price = newPrice;
            System.out.println("Product updated: " + p.productName);
        } else {
            System.out.println("Product not found!");
        }
    }

    public void deleteProduct(int productId) {
        if (productMap.containsKey(productId)) {
            Product p = productMap.remove(productId);
            System.out.println("Deleted: " + p.productName);
        } else {
            System.out.println("Product not found!");
        }
    }

    public void displayAllProducts() {
        System.out.println("----- Inventory -----");
        for (Product p : productMap.values()) {
            System.out.println(p);
        }
    }
}
