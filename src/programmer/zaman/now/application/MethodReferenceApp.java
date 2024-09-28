package programmer.zaman.now.application;

import programmer.zaman.now.lambda.util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {
//        Predicate<String> isPredicateLowerCase = StringUtil::isLowerCase;
//
//        System.out.println(isPredicateLowerCase.test("sony"));
//        System.out.println(isPredicateLowerCase.test("Sony"));

        // Method Reference Parameter
//        Function<String, String> functionUpper = value -> value.toUpperCase();
        Function<String, String> functionUpper = String::toUpperCase;
        System.out.println(functionUpper.apply("eko"));

        MethodReferenceApp referenceApp = new MethodReferenceApp();
        referenceApp.run();
    }

    public void run() {
        Predicate<String> isPredicateLowerCase = this::isLowerCase;

        System.out.println(isPredicateLowerCase.test("sony"));
        System.out.println(isPredicateLowerCase.test("Sony"));
    }

    public boolean isLowerCase(String value) {
        for( var c : value.toCharArray() ) {
            if( ! Character.isLowerCase(c) ) {
                return false;
            }
        }

        return true;
    }
}
