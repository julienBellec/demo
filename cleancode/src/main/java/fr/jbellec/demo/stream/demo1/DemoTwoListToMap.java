/**
 * 
 */
package fr.jbellec.demo.stream.demo1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Construction d'une map à partir de deux listes
 */
public class DemoTwoListToMap {

	public static void main(String[] args) {
		// Liste 1
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

	    // Liste 2
		List<String> refString = Arrays.asList("Joe", "Averell", "Jack", "William", "Lucky");

	    // Construction de la map
	    IntStream.range(0, Math.min(numbers.size(), refString.size()))
	            .boxed().collect(Collectors.toMap(numbers::get, refString::get)).forEach( (x, y) -> System.out.println("key : " + x + " / value : " + y));
	}
}
