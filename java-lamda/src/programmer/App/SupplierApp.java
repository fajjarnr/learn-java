package programmer.App;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Fajar Nur Rohman";

        System.out.println(supplier.get());
    }
}
