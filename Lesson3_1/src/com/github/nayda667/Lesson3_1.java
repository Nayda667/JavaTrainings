package com.github.nayda667;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Lesson3_1 {

    static List<String> numbers = new ArrayList<>();
    static List<String> strings = new LinkedList<>();

    public static void main(String[] args) {
        numbers.add("4");
        numbers.add("-9");
        numbers.add("10");
        numbers.add("1");
        System.out.println(calculateSum());

        strings.add("i");
        strings.add("a");
        strings.add("b");
        System.out.println(sortStrings(strings));

        String sentence = "Hello my dear mum";
        System.out.println(Arrays.toString(splitWord(sentence)));
        System.out.println(concatenateWords(sentence));
    }

    public static String calculateSum() {
        int result = 0;
        for (String number : numbers) {
            int sum = Integer.parseInt(number);
            result += sum;
        }
        return Integer.toString(result);
    }

    public static List<String> sortStrings(List<String> strings) {
        Collections.sort(strings);
        return strings;
    }

    public static String[] splitWord(String sentence) {
        return sentence.split(" ");
    }

    public static String concatenateWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String firstLetter = word.substring(0, 1).toUpperCase();
            result.append(firstLetter).append(word.substring(1));

            if (i != words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}