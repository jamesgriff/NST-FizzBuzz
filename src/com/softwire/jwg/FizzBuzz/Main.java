package com.softwire.jwg.FizzBuzz;

public class Main {

    public static void main(String[] args) {
	    for (Integer i = 1; i <= 300; i++) {

            String output = FizzBuzzGenerator.getFizzBuzzFor(i);

	        System.out.println(i + ": " + output);

        }
    }

}
