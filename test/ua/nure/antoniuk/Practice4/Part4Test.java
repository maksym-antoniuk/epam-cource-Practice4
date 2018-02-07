package ua.nure.antoniuk.Practice4;

import org.junit.Test;

import java.io.IOException;
import java.util.Iterator;

public class Part4Test {

    @Test
    public void testMain() throws IOException {
        Part4.main(null);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testExceptionHasNext() throws IOException {
        Part4 part = new Part4();
        Iterator<String> iterator = part.iterator();
        iterator.hasNext();
        iterator.hasNext();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testExceptionNext() throws IOException {
        Part4 part = new Part4();
        Iterator<String> iterator = part.iterator();
        iterator.next();
        iterator.next();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testExceptionRemove() throws IOException {
        Part4 part = new Part4();
        Iterator<String> iterator = part.iterator();
        iterator.remove();
    }
}
