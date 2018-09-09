package com.softwire.jwg.FizzBuzz;

public class Main {

    public static void main(String[] args) {
//        ClassicMethod();
        StreamMethod();
    }

    private static void ClassicMethod() {
        for (Integer i = 1; i <= 300; i++) {
            String output = FizzBuzzGenerator.getFizzBuzzFor(i);
            System.out.println(i + ": " + output);
        }
    }

    private static void StreamMethod() {
        FizzBuzzStream.create().limit(200).forEach(System.out::println);
    }

}
