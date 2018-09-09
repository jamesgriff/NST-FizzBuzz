package com.softwire.jwg.FizzBuzz;

public class Main {

    public static void main(String[] args) {
	    for (int i = 1; i <= 100; i++) {

            String output = FizzBuzzGenerator.getFizzBuzzFor(i);

	        System.out.println(i + ": " + output);

        }
    }

}
