package fr.jbellec.regex;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SplitWithRegex {

    private static final Logger LOGGER = Logger.getLogger(SplitWithRegex.class.getName());

    public static final String MESSAGE = "chaine : %s - regex : %s - match : %s";

    /**
     * Pour tester les regex : https://regex101.com/
     * Penser à sélectionner le langage java8
     *
     * @param args
     */
    public static void main(String[] args) {
        String chaine = "Ceci est mon texte";
        LOGGER.log(Level.INFO, "chaine : {0}", chaine);

        // regex pour espace
        String regex = "\\s+";
        String[] splitString = chaine.split(regex);
        LOGGER.log(Level.INFO, "Longueur de la chaine : {0}", splitString.length);
        for (String word : splitString) {
            LOGGER.log(Level.INFO, word);
        }
    }

}
