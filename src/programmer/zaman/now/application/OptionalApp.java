package programmer.zaman.now.application;

import java.util.Optional;

public class OptionalApp {
    public static void main(String[] args) {
        sayHello("Sony");
        String name = null;
        sayHello(name);
    }

    public static void sayHello(String name) {
//        Optional.ofNullable(name)
//                .map(String::toUpperCase)
//                .ifPresentOrElse(
//                        System.out::println,
//                        () -> System.out.println("Hello")
//                );

        String upperName = Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElse("Teman");

        System.out.println(upperName);

//        Optional<String> optionalName = Optional.ofNullable(name);
//        Optional<String> optionalNameUpper = optionalName.map(value -> value.toUpperCase());
//        optionalNameUpper.ifPresent(value -> System.out.println(value));
    }
}
