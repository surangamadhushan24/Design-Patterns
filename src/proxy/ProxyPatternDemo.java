package proxy;

public class ProxyPatternDemo {

    public static void main(String[] args) {

        Image image = new ProxyImage("photo.jpg");

        image.display(); // Loads from disk first time
        image.display(); // Uses existing image
    }
}
