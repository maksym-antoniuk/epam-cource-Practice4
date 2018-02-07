package ua.nure.antoniuk.Practice4;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Part3Test {
    private static final InputStream STD_IN = System.in;
    private static final String ENCODING = "Cp1251";

    @Test
    public void testMainMethod() throws IOException {
        System.setIn(new ByteArrayInputStream(
                "char^String^int^double^stop".replace("^", System.lineSeparator()).getBytes(ENCODING)));
        Part3.mainMethod(Util.readFile("part3.txt"));
        System.setIn(STD_IN);
    }

    @Test
    public void testMain() throws IOException {
        System.setIn(new ByteArrayInputStream(
                "char^String^int^double^stop".replace("^", System.lineSeparator()).getBytes(ENCODING)));
        Part3.main(null);
        System.setIn(STD_IN);
    }
}
