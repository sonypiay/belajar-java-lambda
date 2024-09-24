package programmer.zaman.now.application;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {
        Function<String, Integer> functionLength = String::length;
        System.out.println(functionLength.apply("Sony"));
    }
}
