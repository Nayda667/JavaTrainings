package com.github.nayda667;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {
    public static String secondFigure;
    public static String thirdFigure;
    public static int figure2;
    public static int figure3;
    public static List<Integer> integers4 = new ArrayList<>();

    public static void main(String[] args) {
        //задание1
        System.out.println("задание1");
        Integer number = getRandomInteger(99, 1000);
        System.out.println(number);
        List<Integer> integers = convertToArray(number);
        int max = findMaxValue(integers);
        System.out.println(max);
//задаие2
        System.out.println("задание2");
        Integer number1 = getRandomInteger(1, 1000);
        System.out.println(number1);
        Integer number2 = getRandomInteger(1, 1000);
        System.out.println(number2);
        Integer number3 = getRandomInteger(1, 1000);
        System.out.println(number3);
        List<Integer> integers1 = convertToArray(number1);
        List<Integer> integers2 = convertToArray(number2);
        List<Integer> integers3 = convertToArray(number3);
        int firstFigure1 = integers1.getFirst();
        int firstFigure2 = integers2.getFirst();
        int firstFigure3 = integers3.getFirst();
        int sum2 = firstFigure1 + firstFigure2 + firstFigure3;
        System.out.println(sum2);
        //задание3
        System.out.println("задание3");
        int k = Integer.parseInt(number1 + String.valueOf(number2));
        int sum = k - number3;
        System.out.println(sum);
        //задание4
        System.out.println("задание4");
        Integer number4 = getRandomInteger(99, 1000);
        System.out.println(number4);
        List<Integer> integers4 = convertToArray(number4);
        System.out.println(calculateSum(integers4));

    }

    //
    public static Integer getRandomInteger(Integer min, Integer max) {
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }

    public static List<Integer> convertToArray(int number) {
        List<Integer> result = new ArrayList<>();
        while (number > 0) {
            result.add(number % 10);
            number = number / 10;
        }
        Collections.reverse(result);
        return result;
    }

    public static Integer findMaxValue(List<Integer> integers) {
        int max = integers.getFirst();
        for (Integer integer : integers) {
            if (integer > max) {
                max = integer;
            }
        }
        return max;
    }

    public static Integer calculateSum(List<Integer> integers) {
        int result = 0;
        for (int number : integers) {
            result += number;
        }
        return result;
    }
}
