package chapter15;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example10 {
    public static void main(String[] args) {

        String location = "C:\\Users\\Opeyemi02\\Desktop\\sultyFiles\\myFiles";
        Path path = Path.of(location);
        String path1 = "C:\\Users\\Opeyemi02\\Desktop\\sultyFiles\\myFiles\\code";
        try (DirectoryStream<Path> paths = Files.newDirectoryStream(path)) {
            paths.forEach((itemPath) -> {
                if (itemPath.equals(path1)){
                    System.out.println("found part");
                    try {
                      Path p = Files.createTempFile(itemPath,"TorinFile","txt");
                      var writer =Files.newBufferedWriter(p);
                      writer.write("Torin will exit this building");
                      writer.close();
                    }catch (IOException exception){
                        throw new RuntimeException(exception);
                    }
                }
            });
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
