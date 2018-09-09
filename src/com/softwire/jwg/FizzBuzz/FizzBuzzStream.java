package com.softwire.jwg.FizzBuzz;

import java.util.stream.Stream;

public class FizzBuzzStream {
    public static Stream<String> create() {
        // Your code here...
        Stream<Integer> integers = Stream
                .iterate(0, i -> i + 1);

        Stream<String> fizzBuzz = integers.map((i) -> FizzBuzzGenerator.getFizzBuzzFor(i));

        return fizzBuzz;
    }
}
