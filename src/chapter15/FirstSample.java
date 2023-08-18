package chapter15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FirstSample {
    public static void main(String[] args) {


        String location = "C:\\Users\\Opeyemi02\\Desktop\\sultyFiles";

        Path path = Path.of(location);


        try {
           Files.createTempFile(path,"note",".txt");
        }catch (IOException exception){
            System.out.println(exception.getMessage());

        }
    }

}