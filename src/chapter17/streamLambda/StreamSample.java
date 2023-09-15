package chapter17.streamLambda;

import java.util.List;
import java.util.function.Consumer;

public class StreamSample {

    public static void main(String[] args) {


        List<String> names = List.of(
                "Yungidu",
                "Chimezie",
                "Mariam",
                "Torin Stacks"
        );
        Consumer<String> consumer = System.out::println;

        names.stream()
                .forEach(consumer);
    }
}
