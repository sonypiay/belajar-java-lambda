package programmer.zaman.now.application;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {
        Predicate<String> predicateCheckBlank = String::isBlank;

        System.out.println(predicateCheckBlank.test(""));
        System.out.println(predicateCheckBlank.test("Sony"));
    }
}
