package ua.nure.antoniuk.Practice4;


import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Part2 {
    public static final String GEN_PATH     = "part2.txt";
    public static final String OUTPUT_PATH  = "part2_sorted.txt";

    public static void generateFile(String fname) throws IOException {
        FileWriter out = new FileWriter(fname);
        Random r = new Random(System.currentTimeMillis());
        for (int i = 0; i < 10; i++) {
            out.append(String.valueOf(r.nextInt(50))).append(" ");
        }
        out.close();
    }
    public static String readFile(String fileName) throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(new File(fileName), "Cp1251");
        while (scanner.hasNextLine()) {
            sb.append(scanner.nextLine()).append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
    public static void writeToFile(String fileName, int[] arr) throws IOException {
        FileWriter out = new FileWriter(fileName);
        if (arr == null) {
            out.append("EMPTY");
            out.close();
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            out.append(String.valueOf(arr[i])).append(" ");
        }
        out.close();
    }
    public static int[] str2intArr(String str) {

        String strs[] = str.split(" ");
        int[] arr = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals("EMPTY")) return null;
            arr[i] = Integer.parseInt(strs[i]);
        }
        return arr;
    }
    public static void mySort(int[] arr) {
        if (arr == null) return;
        boolean isChange = true;
        int k = 0;
        while (isChange) {
            isChange = false;
            for (int i = 0; i < arr.length - 1 - k; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    isChange = true;
                }
            }
            k++;
        }
    }
    public static void main(String[] args) {
        try {
            generateFile("part2.txt");
            String numbers = readFile(GEN_PATH);
            System.out.println(numbers);
            int[] arr = str2intArr(numbers);
            mySort(arr);
            if (arr != null) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            writeToFile(OUTPUT_PATH, arr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
