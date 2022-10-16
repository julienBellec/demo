package fr.jbellec.patterns.builder;

public class PersonBuilder {
    private Person person;

    public PersonBuilder(final String firstName, final String lastName) {
        person = new Person(firstName, lastName);
    }

    public Person build() {
        return person;
    }

    public PersonBuilder withPhoneNumber(final String phoneNumber) {
        person.setPhoneNumber(phoneNumber);
        return this;
    }

    public PersonBuilder withAdress(String address) {
        person.setAddress(address);
        return this;
    }

}
