package fr.jbellec.kata.fizzbuzz;

import static java.lang.String.valueOf;

public class FizzBuzz {

    private FizzBuzz() {
        throw new IllegalStateException("Utility class");
    }

    public static String appliquerTransformation(int valeur) {
        String fizzBuzz = appliqueRegleTrois(valeur) + appliqueRegleCinq(valeur);
        return ( "".equals(fizzBuzz)) ? valueOf(valeur) : fizzBuzz;
    }

    private static String appliqueRegleTrois(int valeur) {
        return estMultiple(valeur, 3) ? "Fizz" : "";
    }

    private static String appliqueRegleCinq(int valeur) {
        return estMultiple(valeur, 5) ? "Buzz" : "";
    }


    private static boolean estMultiple(int valeur, int multiple) {
        return valeur % multiple == 0;
    }
}
