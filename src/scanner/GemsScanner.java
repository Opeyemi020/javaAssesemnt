package scanner;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GemsScanner {
    private final InputStream inputStream;

    public GemsScanner(InputStream inputStream){
        this.inputStream = inputStream;
    }

    public String next() {
        List<Character> contect = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            int c = bufferedReader.read();
            while (c!=32){
                if (contect.isEmpty())contect.add((char) c);
                c=(char)bufferedReader.read();
                contect.add((char)c);
            }
            return contect.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining());


        }catch (Exception exception){
            throw new RuntimeException(exception);
        }
    }

    public String nextLine() {
        try {
            return new BufferedReader(new InputStreamReader(inputStream)).readLine();
        }catch (Exception exception) {
            throw new RuntimeException(exception);
        }

    }
    public int nextInt(){
        return Integer.parseInt(next());
    }

}
