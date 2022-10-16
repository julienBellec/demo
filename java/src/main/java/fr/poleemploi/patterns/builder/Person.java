package fr.poleemploi.patterns.builder;

public class Person {

	private final String firstname;
	private final String lastname;
	private String phoneNumber = "";
	private String address;

	protected Person(final String firstName, final String lastName) {
		this.firstname = firstName;
		this.lastname = lastName;
	}

	protected void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	protected void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return String.format("Firstname %s - Lastname %s - PhoneNumber %s - Adress %s", firstname, lastname, phoneNumber, address);
		
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Person person = (Person) o;
		return firstname.equals(person.firstname) && lastname.equals(person.lastname);
	}

	@Override
	public int hashCode() {
		return firstname.hashCode() + lastname.hashCode();
	}
	
}
