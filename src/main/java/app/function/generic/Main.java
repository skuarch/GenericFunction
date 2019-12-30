package app.function.generic;

public class Main {

    public static void main(String[] args) {

        Integer in = Checker
                .when(1)
                .then(i -> i + 50)
                .execute();

        String str = Checker.when("mocos")
                .then(s -> s + " verdes")
                .execute();

    }

}
