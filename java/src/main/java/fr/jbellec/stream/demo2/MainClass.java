package fr.jbellec.stream.demo2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Stream;

import fr.jbellec.common.Publication;

public class MainClass {

    public static void main(String[] args) {

        Stream<Publication> publicationStream = null;
        try (Stream<String> input = Files.lines(Paths.get("./data/publications.csv"))) {
            publicationStream = input.map(l -> l.split(";")).map(Publication::fromArray);
            Function<Publication, String> pubTitleFunct = Publication::getTitle;
            Function<Publication, Integer> geoLevelFunct = Publication::getGeoLevel;

            Comparator<Publication> comparePub = Comparator.comparing(pubTitleFunct).thenComparing(geoLevelFunct);
            publicationStream = publicationStream.sorted(comparePub);

            publicationStream.forEach(System.out::println);

        } catch (IOException e) {
            throw new RuntimeException("Impossible de charger le fichier.");
        } finally {
            if (publicationStream != null) {
                publicationStream.close();
            }
        }
    }
}
