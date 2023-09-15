package chapter17.streamLambda;

import java.util.stream.Stream;

public class StreamSample3 {

    public static void main(String[] args) {

        Stream<Integer> numbers = Stream.of(10,20,30,40,50,60);
        numbers.forEach(System.out::println);

        var stream = Stream.generate(()-> "Yungidu");
        stream.forEach(System.out::println);
    }
}
