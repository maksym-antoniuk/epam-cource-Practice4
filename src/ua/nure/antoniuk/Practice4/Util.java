package ua.nure.antoniuk.Practice4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Max on 21.11.2017.
 */
public class Util {

    private static final String ENCODING = "Cp1251";


    public static String readFile(String path) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get(path));
        return new String(bytes, ENCODING);
    }

    public static Matcher getMacher(String regex, String input) {
        return Pattern.compile(regex).matcher(input);
    }
}
