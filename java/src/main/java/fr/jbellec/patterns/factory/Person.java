package fr.jbellec.patterns.factory;

public class Person {
    private String firstName;

    private String lastName;

    public Person(final String firtsName, final String lastName) {
        this.firstName = firtsName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("firstName %s lastName %s", firstName, lastName);
    }
}
