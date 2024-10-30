package com.gitgub.nayda667;

import java.util.ArrayList;

public class Main {
    static ArrayList<String> words = new ArrayList<>();
    static ArrayList<Integer> numbers = new ArrayList<>();
    static String sentence = "";
    static int amount;

    public static void main(String[] args) {
        addNumbers(2);
        addNumbers(667000000);
        addNumbers(48);
        addWord("Hello");
        addWord("world");
        addWord("joke;)");
        printSentence();
        printAmount();
    }

    public static void addWord(String word) {
        words.add(word);
    }

    public static void addNumbers(Integer number) {
        numbers.add(number);
    }

    public static void printSentence() {

        for (String word : words) {
            sentence = sentence + word + " ";
        }
        System.out.println(sentence);
    }

    public static void printAmount() {
        for (int number : numbers) {
            amount = amount + number;
        }
        System.out.println(amount);
    }
}
