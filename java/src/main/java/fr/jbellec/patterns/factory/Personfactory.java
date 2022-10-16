package fr.jbellec.patterns.factory;

import java.util.Objects;

public class Personfactory {

    private static Personfactory instance = null;

    public static Personfactory getInstance() {
        if (Objects.isNull(instance)) {
            instance = new Personfactory();
        }
        return instance;
    }

    public Person getPerson(String firtsName, String lastName) {
        return new Person(firtsName, lastName);
    }
}
