package fr.jbellec.demo.stream.iterate;

import java.util.Optional;
import java.util.stream.Stream;

public class IterateExemple {

	public static void main(String[] args) {
		int lim = 50;

		Stream.iterate(0, x -> x + 1).limit(lim).filter(x -> x % 2 == 0).forEach(System.out::println);
		Optional<Integer> res = Stream.iterate(0, x -> x + 1).limit(lim).filter(x -> x % 2 == 0)
				.reduce((n1, n2) -> n1 + n2);
		System.out.println("Total : " + res.orElse(0));

	}
}
