package ua.nure.antoniuk.Practice4;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Max on 21.11.2017.
 */
public class Part1 {

    public static void main(String[] args) throws IOException{
        System.out.println(mainMethod(Util.readFile("part1.txt")));
    }

    public static String mainMethod(String input) {
        String regex = "(?U)((?:^|\\b)\\w{4,}\\b)";
        Matcher matcher = Util.getMacher(regex, input);
        String temp = new String(input);
        while (matcher.find()){
            temp = temp.replaceFirst(matcher.group(1), matcher.group(1).toUpperCase());
        }
        return temp;
    }





}
