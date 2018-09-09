package com.softwire.jwg.FizzBuzz;

public class FizzBuzzGenerator {
    public static String getFizzBuzzFor(int i) {
        String output;
        if (i % 15 == 0) {
            output = "FizzBuzz";
        } else if (i % 3 == 0) {
            output = "Fizz";
        } else if (i % 5 == 0) {
            output = "Buzz";
        } else {
            output = "" + i;
        }
        return output;
    }
}
