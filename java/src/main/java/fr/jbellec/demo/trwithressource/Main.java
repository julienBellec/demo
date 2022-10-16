package fr.jbellec.demo.trwithressource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		try (Stream<String> input = Files.lines(Paths.get("./data/publications.csv"))) {
			input.forEach(System.out::println);

		} catch (IOException e) {
			throw new RuntimeException("Impossible de charger le fichier.");
		}

	}

}
