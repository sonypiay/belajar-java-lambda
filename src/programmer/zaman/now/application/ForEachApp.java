package programmer.zaman.now.application;

import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {
    public static void main(String[] args) {
        List<String> list = List.of("Sony", "Darmawan", "Eko");

        // loop
        for( var l : list ) {
            System.out.println(l);
        }

        // anonymous class
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        // lambda
        list.forEach(value -> System.out.println(value));

        // lambda method reference
        list.forEach(System.out::println);
    }
}
