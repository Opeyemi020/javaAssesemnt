package chapter15;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileAndPath {

    public static void main(String[] args) throws IOException {
        String files = """
                {
                name : milk
                price : 50.00
                quality : -15
                id : 1
                },
                {
                name : milk
                price : 50.00
                quality : -15
                id : 1
                },
                {
                name : milk
                price : 50.00
                quality : -15
                id : 1
                },
                {
                name : milk
                price : 50.00
                quality : -15
                id : 1
                },
                {
                name : milk
                price : 50.00
                quality : -15
                id : 1
                },
                {
                name : milk
                price : 50.00
                quality : -15
                id : 1
                },
                {
                name : milk
                price : 50.00
                quality : -15
                id : 1
                },
                {
                name : milk
                price : 50.00
                quality : -15
                id : 1
                },
                {
                name : milk
                price : 50.00
                quality : -15
                id : 1
                },
                {
                name : milk
                price : 50.00
                quality : -15
                id : 1
                }
                """;

        String location = "C:\\Users\\Opeyemi02\\Desktop\\product.json";
        Path path = Paths.get(location);

        try (BufferedReader bufferedReader = Files.newBufferedReader(path)) {
            Stream<String> content = bufferedReader.lines();
            content.forEach(System.out::println);
        } catch (IOException e) {
            System.err.println(e.getMessage());


        }
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write(files);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}

//      BufferedWriter writer = new BufferedWriter(new FileWriter(path.toFile()));
//        BufferedReader reader1 = new BufferedReader(new FileReader(path2.toFile()));
//        String currentLine = null;
//        String replace = """
//                name : sugar
//                price : 300
//                quality : 55
//                id : 4""";
//        String lineToReplace = null;
//        while (lines == String.valueOf(reader1.readLine() != null)){
//        if (!currentLine.trim().equals(lineToReplace)){
//        writer.write(currentLine + System.getProperty(""));
//        }
//        writer.close();
//        reader1.close();
//        System.out.println(path.compareTo(path2));
//        if (!path.equals(path)){
//        files.replaceAll("",replace);
//        }