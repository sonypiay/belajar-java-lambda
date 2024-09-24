package programmer.zaman.now.application;

import programmer.zaman.now.lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {
        SimpleAction simpleAction = new SimpleAction() {
            @Override
            public String action(String name) {
                return name;
            }
        };

//        System.out.println(simpleAction.action());
//
//        SimpleAction simpleAction1 = () -> {
//            return "Sony";
//        };

        SimpleAction simpleAction1 = (String name) -> {
            return "Hello " + name;
        };

        SimpleAction simpleAction2 = (name) -> {
            return name;
        };

        SimpleAction simpleAction3 = (name) -> name;
    }
}
