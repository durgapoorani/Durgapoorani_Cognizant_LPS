public class ImageViewerTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("nature.jpg");
        Image image2 = new ProxyImage("space.png");

        // Image will be loaded now
        image1.display();
        System.out.println();

        // Image will not be loaded again (cached)
        image1.display();
        System.out.println();

        // New image - will be loaded
        image2.display();
    }
}
