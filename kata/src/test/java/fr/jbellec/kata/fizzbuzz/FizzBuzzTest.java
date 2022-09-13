package fr.jbellec.kata.fizzbuzz;

import static fr.jbellec.kata.fizzbuzz.FizzBuzz.appliquerTransformation;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    @DisplayName("Retourne la même valeur")
    void doit_retourner_la_meme_valeur(){
        assertEquals("1", appliquerTransformation(1));
    }

    @Test
    @DisplayName("Retourne Fizz pour un multiple de 3")
    void doit_retourner_Fizz_pour_multiple_de_trois(){
        assertEquals("Fizz", appliquerTransformation(12));
    }

    @Test
    @DisplayName("Retourne Buzz pour un multiple de 5")
    void doit_retourner_Fizz_pour_multiple_de_cinq(){
        assertEquals("Buzz", appliquerTransformation(10));
    }

    @Test
    @DisplayName("Retourne FizzBuzz pour un multiple de 3 et 5")
    void doit_retourner_Fizz_pour_multiple_de_trois_et_cinq(){
        assertEquals("FizzBuzz", appliquerTransformation(30));
    }
}
