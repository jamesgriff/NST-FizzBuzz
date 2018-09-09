package com.softwire.jwg.FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzGenerator {
    public static String getFizzBuzzFor(Integer i) {

        List<String> words = new ArrayList<>();
        if (i % 3 == 0) {
            words.add("Fizz");
        }
        if (i % 5 == 0) {
            words.add("Buzz");
        }

        if (!words.isEmpty()) {
            return String.join("", words);
        }
        else {
            return i.toString();
        }
    }
}
