package fr.jbellec.cleancode.refactoring.before;

public class Refactoring {

	public String print(String arg) {
		String[] tab = arg.split(",");
		if (tab.length == 0)
			return "";
		
		if (tab[1].equals("exit"))
			return "exit";
		
		if (tab.length == 1)
			return "short list";
		
		String retour = tab[2];
		return retour;
		
 	}
}
