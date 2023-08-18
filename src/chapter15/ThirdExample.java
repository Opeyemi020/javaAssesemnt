package chapter15;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ThirdExample {
    public static void main(String[] args) {

        String content = """
                public Class Account{
                    private String name;
                    private BigDecimal balance;
                    
                    
                    
                    public Account(String name, BigDecimal balance){
                        this.name = name;
                        this.balance = balance
                    }
                    
                    public static void main(String[] args) {
                    System.out.println();
                    }
                  }""";


        String location = "C:\\Users\\Opeyemi02\\Desktop\\sultyFiles\\Account.java";

        Path path = Path.of(location);


        try {
           Path filePath = Files.createFile(path);
           BufferedWriter writer = Files.newBufferedWriter(filePath);
            writer.write(content);
            writer.close();
        }catch (IOException exception){
            exception.printStackTrace();
            System.err.println(exception.getMessage());

        }
    }
}
