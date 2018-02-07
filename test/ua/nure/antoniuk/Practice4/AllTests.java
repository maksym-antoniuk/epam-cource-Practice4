package ua.nure.antoniuk.Practice4;

import org.junit.Test;

import java.io.IOException;

public class AllTests {

    @Test
    public void testPart1() throws IOException {
        Part1Test test = new Part1Test();
        test.testConstructorPart1();
        test.testMainMethod();
        test.testMain();
    }

    @Test
    public void testPart2() throws Exception {
        Part2Test test = new Part2Test();
        test.testConstructorPart2();
        test.testGenerateFile();
        test.testMainMethod();
        test.testMain();
    }

    @Test
    public void testPart3() throws IOException {
        Part3Test test = new Part3Test();
        test.testMainMethod();
        test.testMain();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testPart4() throws IOException {
        Part4Test test = new Part4Test();
        test.testExceptionHasNext();
        test.testExceptionNext();
        test.testExceptionRemove();
        test.testMain();
    }

    @Test
    public void testPart5() throws IOException {
        Part5Test test = new Part5Test();
        test.testConstructorPart5();
        test.testMain();
    }
}
