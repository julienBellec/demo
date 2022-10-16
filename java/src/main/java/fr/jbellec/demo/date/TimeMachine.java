package fr.jbellec.demo.date;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class TimeMachine {
	public static void main(String[] args) {
		Instant now = Instant.now();
		System.out.println("now : " + now.toString());
		Instant plus = now.plus(10, ChronoUnit.SECONDS);
		System.out.println("plus : " + plus.toString());
		System.out.println("Nb seconds : " + now.until(plus, ChronoUnit.SECONDS));
	}
}
