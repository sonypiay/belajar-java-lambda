package programmer.zaman.now.application;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Sony Darmawan";

        System.out.println(supplier.get());
    }
}
