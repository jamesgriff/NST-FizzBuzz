package com.softwire.jwg.FizzBuzz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FizzBuzzGenerator {
    public static String getFizzBuzzFor(Integer number) {

        List<String> words = new ArrayList<>();
        applyRuleFor3(number, words);
        applyRuleFor5(number, words);
        applyRuleFor7(number, words);
        applyRuleFor11(number, words);
        applyRuleFor13(number, words);
        applyRuleFor17(number, words);

        if (!words.isEmpty()) {
            return String.join("", words);
        }
        else {
            return number.toString();
        }
    }

    private static void applyRuleFor3(Integer number, List<String> words) {
        if (number % 3 == 0) {
            words.add("Fizz");
        }
    }

    private static void applyRuleFor5(Integer number, List<String> words) {
        if (number % 5 == 0) {
            words.add("Buzz");
        }
    }

    private static void applyRuleFor7(Integer number, List<String> words) {
        if (number % 7 == 0) {
            words.add("Bang");
        }
    }

    private static void applyRuleFor11(Integer number, List<String> words) {
        if (number % 11 == 0) {
            words.clear();
            words.add("Bong");
        }
    }

    private static void applyRuleFor13(Integer number, List<String> words) {
        if (number % 13 == 0) {
            Integer positionToAdd = getIndexOfFirstB(words);
            List<String> newWords = new ArrayList<>();

            if (positionToAdd > 0) {
                newWords.addAll(words.subList(0, positionToAdd));
            }
            newWords.add("Fezz");
            if (words.size() > 0 && words.size() > positionToAdd) {
                newWords.addAll(words.subList(positionToAdd, words.size()));
            }

            words.clear();
            words.addAll(newWords);
        }
    }

    private static Integer getIndexOfFirstB(List<String> words) {
        for (Integer i = 0; i < words.size(); i++) {
            if (words.get(i).startsWith("B")) {
                return i;
            }
        }
        return words.size();
    }

    private static void applyRuleFor17(Integer number, List<String> words) {
        if (number % 17 == 0) {
            Collections.reverse(words);
        }
    }
}
