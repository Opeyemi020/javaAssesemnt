package scanner;

import org.junit.jupiter.api.Test;

import static java.lang.System.in;
import static org.junit.jupiter.api.Assertions.*;

class GemsScannerTest {


    @Test
    void testRead(){
        GemsScanner scanner = new GemsScanner(in);
        String input = scanner.next();
        assertNotNull(input);

    }


}