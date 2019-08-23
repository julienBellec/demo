package fr.jbellec.oc.java.lambda;

import java.util.function.Predicate;

public class App {

	public static void main(String[] args) {
		Dialoguer d = (s) -> System.out.println("Tu as dit " + s);
		d.parler("question");
		
		Predicate<String> p  = (s) -> s.length()>1;
		System.out.println(p.test("12"));
	}

}
