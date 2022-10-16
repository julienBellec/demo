package fr.jbellec.lambda.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class TestFucntion {

    public static void main(String[] args) {

        List<Personne> lPersonne = Arrays.asList(new Personne(10, "toto"), new Personne(20, "titi"), new Personne(30, "tata"), new Personne(40, "tutu"));

        Function<Personne, String> f1 = Personne::getNom;
        ToIntFunction<Personne> f2 = (p) -> p.getAge() * 2;
        System.out.println(transformToListString(lPersonne, f1));
        System.out.println(transformToListInt(lPersonne, f2));
    }

    public static List<String> transformToListString(List<Personne> list, Function<Personne, String> func) {
        List<String> ls = new ArrayList<>();
        list.forEach(p -> ls.add(func.apply(p)));
        return ls;
    }

    public static List<Integer> transformToListInt(List<Personne> list, ToIntFunction<Personne> func) {
        List<Integer> ls = new ArrayList<>();
        for (Personne p : list) {
            ls.add(func.applyAsInt(p));
        }
        return ls;
    }
}
