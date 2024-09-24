package programmer.zaman.now.application;

import java.util.function.Consumer;

public class ConsumerApp {
    public static void main(String[] args) {
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        consumer.accept("Sony");
    }
}
