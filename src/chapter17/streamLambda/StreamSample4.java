package chapter17.streamLambda;

import java.util.stream.IntStream;

public class StreamSample4 {
    public static void main(String[] args) {

        var stream = IntStream.range(1,11);
        stream.filter((number)->number%2==0)
                .forEach(System.out::println);
    }
}
