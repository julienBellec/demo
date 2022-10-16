package fr.jbellec.demo.pattern;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
	
	private static final Logger logger = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {
		UserCrud crud = new UserManager();
		UserConnection userConnection = new UserManager();
		logger.log(Level.INFO,String.valueOf(crud.create("1234")));
		logger.log(Level.INFO,String.valueOf(userConnection.connect()));
	}

}
