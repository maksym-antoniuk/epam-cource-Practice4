package ua.nure.antoniuk.Practice4;


import java.io.IOException;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Max on 21.11.2017.
 */
public class Part4 implements Iterable {

    private String input;

    public static void main(String[] args) throws IOException{
        Part4 part = new Part4();
        Iterator<String> iterator = part.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }

    }

    public Part4() throws IOException{
        input = Util.readFile("part4.txt");
    }

    @Override
    public MyIterator iterator() {
        return new MyIterator();
    }


    public class MyIterator implements Iterator<String>{
        private String text;
        private final String regex = "(?Um)(\\p{javaUpperCase}.+?(?:\\.|\\?|!))";
        private boolean flag = false;
        private Matcher matcher;
        private String lastMatch = "";

        MyIterator() {
            text = new String(input);
            Pattern pattern = Pattern.compile(regex, Pattern.DOTALL);
            matcher = pattern.matcher(text);
        }

        private void changeFlag() {
            flag = !flag;
        }

        @Override
        public boolean hasNext() {
            if (!flag) {
                changeFlag();
                return matcher.find();
            } else {
                throw new UnsupportedOperationException();
            }
        }

        @Override
        public String next() {
            if (flag) {
                changeFlag();
                lastMatch = matcher.group(1).replace(System.lineSeparator(), "");
                //input.replaceFirst(lastMatch, "");
                return lastMatch;
            } else {
                throw new UnsupportedOperationException();
            }
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
