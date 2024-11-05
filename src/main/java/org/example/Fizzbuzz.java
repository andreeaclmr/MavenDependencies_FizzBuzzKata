package org.example;

public class Fizzbuzz {

    public String checkNumber(int number) {
        if((number%3 == 0) && (number%5 == 0)){
            return "Fizzbuzz";
        }
        if (number%3 == 0) {
            return "Fizz";
        }

        if (number%5 == 0) {
            return "Buzz";
        }
        if((number%3 != 0) && (number%5 != 0)){
            return String.valueOf(number);
        }
        return null;
    }
}

