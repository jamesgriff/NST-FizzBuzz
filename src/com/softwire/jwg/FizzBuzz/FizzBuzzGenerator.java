package com.softwire.jwg.FizzBuzz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FizzBuzzGenerator {
    public static String getFizzBuzzFor(Integer i) {

        List<String> words = new ArrayList<>();
        doFizz(i, words);
        doBuzz(i, words);
        doBang(i, words);
        doBong(i, words);
        doFezz(i, words);
        doReverse(i, words);

        if (!words.isEmpty()) {
            return String.join("", words);
        }
        else {
            return i.toString();
        }
    }

    private static void doFizz(Integer i, List<String> words) {
        if (i % 3 == 0) {
            words.add("Fizz");
        }
    }

    private static void doBuzz(Integer i, List<String> words) {
        if (i % 5 == 0) {
            words.add("Buzz");
        }
    }

    private static void doBang(Integer i, List<String> words) {
        if (i % 7 == 0) {
            words.add("Bang");
        }
    }

    private static void doBong(Integer i, List<String> words) {
        if (i % 11 == 0) {
            words.clear();
            words.add("Bong");
        }
    }

    private static void doFezz(Integer i, List<String> words) {
        if (i % 13 == 0) {
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
        for (Integer j = 0; j < words.size(); j++) {
            if (words.get(j).startsWith("B")) {
                return j;
            }
        }
        return words.size();
    }

    private static void doReverse(Integer i, List<String> words) {
        if (i % 17 == 0) {
            Collections.reverse(words);
        }
    }
}
