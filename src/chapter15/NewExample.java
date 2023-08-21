package chapter15;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class NewExample {
        public static void main(String[] args) {
            String location ="C:\\Users\\Opeyemi02\\Desktop\\sultyFiles\\myFiles";
            Path path = Paths.get(location);

            //READING FROM A FILE.
            try (BufferedReader bufferedReader = Files.newBufferedReader(path)){
                Stream<String> content = bufferedReader.lines();
                content.forEach(System.out::println);
            }catch (IOException exception){
                System.err.println(exception.getMessage());
            }

            //WRITING TO A FILE.
//        try (BufferedWriter writer = Files.newBufferedWriter(path)){
//           writer.write("""
//                   Joy likes mango
//                   Joy likes mango
//                   Joy likes mango
//                   Joy likes mango
//                   Joy likes mango
//                   """);
//        }catch (IOException exception){
//            System.err.println(exception.getMessage());


    }
}
