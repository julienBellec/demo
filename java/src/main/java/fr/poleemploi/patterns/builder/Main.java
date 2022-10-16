package fr.poleemploi.patterns.builder;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger("flogger");

    public static void main(String[] args) {

        Person person = new PersonBuilder("FirstName", "LastName").withAdress("Nantes").withPhoneNumber("0102030405").build();
        if (logger.isLoggable(Level.INFO)) {
            logger.info(person.toString());
        }

    }

}
