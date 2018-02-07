package ua.nure.antoniuk.Practice4;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.IOException;

public class Part1Test {

    @Test
    public void testConstructorPart1() {
        new Part1();
    }

    @Test()
    public void testMainMethod() {
        assertEquals("MAXIM lol √≈“‹",Part1.mainMethod("Maxim lol „ÂÚ¸"));
    }

    @Test
    public void testMain() throws IOException{
        Part1.main(null);
    }

}
