package fr.jbellec.regex;

import java.util.logging.Level;
import java.util.logging.Logger;

import static java.lang.String.format;

public class StringMatches {

    private static final Logger LOGGER = Logger.getLogger(StringMatches.class.getName());

    public static final String MESSAGE = "chaine : %s - regex : %s - match : %s";

    /**
     * Pour tester les regex : https://regex101.com/
     * Penser à sélectionner le langage java8
     *
     * @param args
     */
    public static void main(String[] args) {
        String chaine = "a";
        LOGGER.log(Level.INFO, "chaine : {0}", chaine);

        // un caractère
        String regex = ".";
        LOGGER.log(Level.INFO, format(MESSAGE, chaine, regex, chaine.matches(regex))); // true
        chaine = "abc";
        LOGGER.log(Level.INFO, format(MESSAGE, chaine, regex, chaine.matches(regex))); // falsee
        // des caractères
        regex = ".*";
        LOGGER.log(Level.INFO, format(MESSAGE, chaine, regex, chaine.matches(regex))); // true
        // -----------------------------------------------------------------------------------
        // commence par m
        regex = "^m";
        chaine = "m";
        LOGGER.log(Level.INFO, format(MESSAGE, chaine, regex, chaine.matches(regex))); // true
        chaine = "mnp";
        // retourne false car la chaîne contient plus d un caractères
        LOGGER.log(Level.INFO, format(MESSAGE, chaine, regex, chaine.matches(regex))); // false
        regex = "^m.+";
        // retourne true car la regex autorise des caractères après le m
        LOGGER.log(Level.INFO, format(MESSAGE, chaine, regex, chaine.matches(regex))); // true
        // -----------------------------------------------------------------------------------
        // finit par m
        regex = "$p";
        chaine = "m";
        LOGGER.log(Level.INFO, format(MESSAGE, chaine, regex, chaine.matches(regex))); // true
        chaine = "mnp";
        // retourne false car la chaîne contient plus d un caractères
        LOGGER.log(Level.INFO, format(MESSAGE, chaine, regex, chaine.matches(regex))); // false
        regex = ".+p$";
        // retourne true car la regex autorise des caractères avant m
        LOGGER.log(Level.INFO, format(MESSAGE, chaine, regex, chaine.matches(regex))); // true
        // -----------------------------------------------------------------------------------
        // Répétition de caractères
        // Vérifie que la chaîne contient 1, 2 ou 3 n
        regex = "n{1,3}";
        chaine = "n";
        LOGGER.log(Level.INFO, format(MESSAGE, chaine, regex, chaine.matches(regex))); // true
        chaine = "nn";
        LOGGER.log(Level.INFO, format(MESSAGE, chaine, regex, chaine.matches(regex))); // true
        chaine = "nnn";
        LOGGER.log(Level.INFO, format(MESSAGE, chaine, regex, chaine.matches(regex))); // true
        chaine = "ann";
        LOGGER.log(Level.INFO, format(MESSAGE, chaine, regex, chaine.matches(regex))); // false
        // -----------------------------------------------------------------------------------
        // Combinaison : un caractère, puis 1 ou 2 ou 3 n, puis p
        regex = ".n{1,3}p$";
        chaine = "anp";
        LOGGER.log(Level.INFO, format(MESSAGE, chaine, regex, chaine.matches(regex))); // true
        chaine = "annp";
        LOGGER.log(Level.INFO, format(MESSAGE, chaine, regex, chaine.matches(regex))); // true
        chaine = "annnp";
        LOGGER.log(Level.INFO, format(MESSAGE, chaine, regex, chaine.matches(regex))); // true
        chaine = "ann";
        LOGGER.log(Level.INFO, format(MESSAGE, chaine, regex, chaine.matches(regex))); // false
        chaine = "nnp";
        LOGGER.log(Level.INFO, format(MESSAGE, chaine, regex, chaine.matches(regex))); // false
        // -----------------------------------------------------------------------------------
        // contient soit x, soit y, soit z : [x,y,z]
        regex = ".[x,y,z].";
        chaine = "2xb";
        LOGGER.log(Level.INFO, format(MESSAGE, chaine, regex, chaine.matches(regex))); // true
        chaine = "2Ab";
        LOGGER.log(Level.INFO, format(MESSAGE, chaine, regex, chaine.matches(regex))); // false

        // https://devstory.net/10175/java-regular-expression
    }

}
