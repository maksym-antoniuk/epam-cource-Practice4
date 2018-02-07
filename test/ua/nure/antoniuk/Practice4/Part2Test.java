package ua.nure.antoniuk.Practice4;
import static org.junit.Assert.*;
import org.junit.Test;

import java.io.IOException;

public class Part2Test {

    @Test
    public void testConstructorPart2() {
        new Part2();
    }

    @Test
    public void testGenerateFile() throws Exception {
        Part2.generateFile("part2.txt");
    }


    @Test
    public void testMainMethod() throws IOException{
        assertEquals("input  ==> 30 23 16 16 9 23 3 18 21 29\n" +
                "output ==> 3 9 16 16 18 21 23 23 29 30", Part2.mainMethod("part2test.txt"));
    }

    @Test
    public void testMain() throws IOException {
        Part2.main(null);
    }
}
