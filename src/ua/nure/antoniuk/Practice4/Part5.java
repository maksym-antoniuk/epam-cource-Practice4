package ua.nure.antoniuk.Practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Objects;
import java.util.ResourceBundle;

/**
 * Created by Max on 21.11.2017.
 */
public class Part5 {
    private static final String STOP = "stop";

    public static void main(String[] args) throws IOException {
        mainMethod("resources");
    }

    public static void mainMethod(String input) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        ResourceBundle rs;
        String[] strings;
        while (true) {
            s = br.readLine();
            if (STOP.equals(s) | Objects.isNull(s)) {
                break;
            }
            strings = s.split(" ");
            rs = ResourceBundle.getBundle(input, new Locale(strings[1]));
            System.out.println(rs.getString(strings[0]));
        }
    }
}
