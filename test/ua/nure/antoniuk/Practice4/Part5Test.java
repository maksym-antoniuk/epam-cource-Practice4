package ua.nure.antoniuk.Practice4;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Part5Test {
    private static final InputStream STD_IN = System.in;

    private static final String ENCODING = "Cp1251";

    @Test
    public void testMain() throws IOException{
        System.setIn(new ByteArrayInputStream(
                "table ru^table en^apple ru^stop".replace("^", System.lineSeparator()).getBytes(ENCODING)));
        Part5.main(null);
        System.setIn(STD_IN);

    }

    @Test
    public void testConstructorPart5() {
        new Part5();
    }
}
