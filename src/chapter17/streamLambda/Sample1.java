package chapter17.streamLambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Sample1 {

    public static void main(String[] args) {

        Comparator<String> comparator = (firstWord, secondWord)->{
            return secondWord.compareTo(firstWord);
        };
        List<String> words = List.of("Hello","Hi","Hey","Yungidu","Hola");
        List<String> greetings = new ArrayList<>();
        System.out.println(Objects.hash("joy"));
    }
}
