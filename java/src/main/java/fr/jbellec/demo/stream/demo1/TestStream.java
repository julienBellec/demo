package fr.jbellec.demo.stream.demo1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {

    private static List<Personne> listP = new ArrayList<>();

    private static Map<String, List<Personne>> mapP = new TreeMap<>();

    public static final String[] TYPE_PERSONNE_ARRAY = new String[] {"Android", "Hybrid", "Higher"};

    static {
        listP = Arrays.asList(new Personne(1.80, 70, "A", "Nicolas", Couleur.BLEU), new Personne(1.56, 50, "B", "Nicole", Couleur.VERRON),
            new Personne(1.75, 65, "C", "Germain", Couleur.VERT), new Personne(1.68, 50, "D", "Michel", Couleur.ROUGE), new Personne(1.96, 65, "E", "Cyrille", Couleur.BLEU),
            new Personne(2.10, 120, "F", "Denis", Couleur.ROUGE), new Personne(1.90, 90, "G", "Olivier", Couleur.VERRON));

        mapP.put("Android", listP);
        mapP.put("Hybrid", null);
        mapP.put("Higher", listP);
    }

    public static void main(String[] args) {
        // testStreamListPersonne();
        // testLimitList();
        // testStreamPredicate();
        // testStreamMap();
        // testStreamReduce();
        //testStreamReduceIfPresent();
        //testStreamMapNotEmpty();
        testStreamMapToString();
    }

    /**
     * Renvoi la map sans les clés contenant des valeurs vides ou nulles
     */
    private static void testStreamMapNotEmpty() {

        Map<String, List<Personne>> notEmtpy = mapP.entrySet().stream().filter(e -> e.getValue() != null && !e.getValue().isEmpty()).limit(1)
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        notEmtpy.forEach((k, l) -> System.out.println(k + " / " + l));
    }

    /**
     * Renvoi une chaîne de caractère d'une valeur de la map
     */
    private static void testStreamMapToString() {
        String test = mapP.entrySet().stream().limit(1).map(entry -> "" + entry.getValue().stream().map(Personne::getPrenom).collect(Collectors.joining(", ")))
            .collect(Collectors.joining(", "));

        System.out.println("test : " + test);
    }

    private static void testStreamListPersonne() {
        Stream<Personne> sp = listP.stream();
        sp.forEach((Personne p) -> System.out.println(p.toString()));
    }

    private static void testLimitList() {
        Stream.iterate(2d, (x) -> x + 1).limit(100).forEach(System.out::println);
    }

    private static void testStreamPredicate() {
        Stream<Personne> sp = listP.stream();
        sp.forEach(System.out::println);

        System.out.println("\nAprès le filtre");
        sp = listP.stream();
        sp.filter(x -> x.getPoids() > 50).forEach(System.out::println);
    }

    /**
     * Ici, nous allons appliquer une opération sur chaque élément afin de ne
     * récupérer que ce qui nous intéresse.<br />
     * Par exemple, en ne conservant que le poids de personnes que nous avons
     * filtré.
     */
    private static void testStreamMap() {
        Stream<Personne> sp = listP.stream();
        sp.forEach(System.out::println);

        System.out.println("\nAprès le filtre et le map");
        sp = listP.stream();
        sp.filter(x -> x.getPoids() > 50).map(x -> x.getPoids()).forEach(System.out::println);
    }

    /**
     * Cette opération a pour but d'agréger le contenu de votre stream pour
     * fournir un résultat unique.<br />
     * Que diriez-vous d'avoir la somme des poids des personnes que nous avons
     * filtré précédemment.
     */
    private static void testStreamReduce() {
        Stream<Personne> sp = listP.stream();
        sp.forEach(System.out::println);

        System.out.println("\nAprès le filtre et le map et reduce");
        sp = listP.stream();

        Double sum = sp.filter(x -> x.getPoids() > 50).map(x -> x.getPoids()).reduce(0.0d, (x, y) -> x + y);
        System.out.println(sum);
    }

    private static void testStreamReduceIfPresent() {
        Stream<Personne> sp = listP.stream();
        sp = listP.stream();

        Optional<Double> sum = sp.filter(x -> x.getPoids() > 250).map(x -> x.getPoids()).reduce((x, y) -> x + y);

        if (sum.isPresent())
            System.out.println(sum.get());
        else
            System.out.println("Aucun aggrégat de poids...");

        // Permet de gérer le cas d'erreur en renvoyant 0.0 si isPresent() ==
        // false
        System.out.println(sum.orElse(0.0));
    }

    private static void testStreamCount() {
        Stream<Personne> sp = listP.stream();
        sp = listP.stream();

        long count = sp.filter(x -> x.getPoids() > 50).map(x -> x.getPoids()).count();

        System.out.println("Nombre d'éléments : " + count);
    }

    /**
     * Permet de récupérer le résultat des opérations successives sous une
     * certaines forme. <br />
     * Cette forme est définie par un objet Collectors (implémentant l'interface
     * Collector ).<br />
     * C'est avec cet objet que nous pourrons dire que nous souhaitons avoir
     * notre résultat sous forme de Set , de Map , de List et plus encore.
     */
    private static void testStreamCollect() {
        Stream<Personne> sp = listP.stream();
        sp = listP.stream();

        List<Double> ld = sp.filter(x -> x.getPoids() > 50).map(x -> x.getPoids()).collect(Collectors.toList());
        System.out.println(ld);
    }

    /**
     *
     */
    private static void testStreamFile() {
        String fileName = "D://Documents/IPTABLES.sh";
        try (Stream<String> sf = Files.lines(Paths.get(fileName))) {
            sf.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
