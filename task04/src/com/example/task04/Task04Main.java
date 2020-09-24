package com.example.task04;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Formatter;
import java.util.Locale;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        double sum = 0.0;
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        while (inputStreamReader.ready()) {
            stringBuilder.appendCodePoint(inputStreamReader.read());
        }
        String[] parsed = stringBuilder.toString().split("\\s");
        for (String num : parsed) {
            try {
                sum += Double.parseDouble(num);
            } catch (NumberFormatException ignored) {

            }
        }
        System.out.println(new Formatter(Locale.US).format("%.6f", sum));
    }
}
