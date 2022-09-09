package fr.jbellec.kata.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    void testKata(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1 2 FizzFizz 4 BuzzBuzz Fizz 7 8 Fizz Buzz 11 Fizz Fizz 14 FizzBuzzBuzz 16 17 Fizz 19 Buzz Fizz 22 Fizz Fizz BuzzBuzz 26 Fizz 28 29 FizzFizzBuzz", fizzBuzz.kata(1, 30));
    }
}
