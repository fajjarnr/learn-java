package programmer.application;

// import untuk memngunkan class diluar package
import programmer.data.*; // * untuk import semua class di package
import programmer.data.Product;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("Samsung", 100000);

        System.out.println(product.name);
        System.out.println(product.price);

        Data data = new Data();
    }
}
