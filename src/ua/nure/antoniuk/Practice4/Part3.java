package ua.nure.antoniuk.Practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.regex.Matcher;

/**
 * Created by Max on 21.11.2017.
 */
public class Part3 {
    public static void main(String[] args) throws IOException {
        mainMethod(Util.readFile("part3.txt"));
    }

    private static final String REG_CHARACTER = "(?U)(?:^|\\b)(\\p{L}\\b)";
    private static final String REG_INTEGER = "(?:^| )(\\d+)(?:\\z| )";
    private static final String REG_DOUBLE = "(?: |^)((?:\\.\\d+)|(?:\\d+\\.\\d+)|(?:\\d+\\.)(?= |\\z))";
    private static final String REG_STRING = "(?U)((?:[^0-9\\s\\.]\\S+)|(?:\\S+[^0-9\\s\\.]))";
    private static final String CHARACTER = "char";
    private static final String INTEGER = "int";
    private static final String DOUBLE = "double";
    private static final String STRING = "String";
    private static final String STOP = "stop";


    private static void print(String regex, String input) {
        Matcher matcher = Util.getMacher(regex, input);
        StringBuilder sb = new StringBuilder();
        while (matcher.find()) {
        	sb.append(matcher.group(1)).append(" ");
        }
        sb.replace(sb.length()-1, sb.length(), "");
        System.out.println(sb.toString());
    }

    public static void mainMethod(String input) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while (true) {
            s = br.readLine();
            if (STOP.equals(s) | Objects.isNull(s)) {
                break;
            }
            switch (s) {
                case CHARACTER:
                    print(REG_CHARACTER, input);
                    break;
                case INTEGER:
                    print(REG_INTEGER, input);
                    break;
                case DOUBLE:
                    print(REG_DOUBLE, input);
                    break;
                case STRING:
                    print(REG_STRING, input);
                    break;
                default:
                    break;
            }
        }
    }
}
