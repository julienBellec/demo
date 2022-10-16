package fr.poleemploi.patterns.factory;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

	public static void main(String[] args) {
		Person person = Personfactory.getInstance().getPerson("firstName", "lastName");
		 Logger logger = Logger.getLogger("flogger");
		 ConsoleHandler ch=new ConsoleHandler();
		 ch.setLevel(Level.INFO);
		 logger.addHandler(ch);
		 logger.setLevel(Level.INFO);
		 if (logger.isLoggable(Level.INFO)) {
			 logger.info(person.toString());			 
		 }

	}

}
