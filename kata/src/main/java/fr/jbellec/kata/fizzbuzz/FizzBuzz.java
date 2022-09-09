package fr.jbellec.kata.fizzbuzz;

import static java.lang.String.valueOf;

public class FizzBuzz {

    public String kata(int start, int end) {
        String result = valueOf(start);
        while (start < end) {
            start++;
            String value = "";

            if (start % 3 == 0) {
                value = "Fizz";
            }
            if (valueOf(start).contains("3")){
                value = value + "Fizz";
            }
            if (start % 5 == 0) {
                value = value + "Buzz";
            }
            if (valueOf(start).contains("5")){
                value = value + "Buzz";
            }

            if ("".equals(value)) {
                value = valueOf(start);
            }

            result = result + " " + value;
        }
        return result;
    }
}
