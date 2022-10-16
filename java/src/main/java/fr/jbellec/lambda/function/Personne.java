package fr.jbellec.lambda.function;

public class Personne {

    private String nom;

    private int age;

    public String getNom() {
        return nom;
    }

    public void setNom(String name) {
        this.nom = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Personne(int age, String nom) {
        this.nom = nom;
        this.age = age;
    }

}
