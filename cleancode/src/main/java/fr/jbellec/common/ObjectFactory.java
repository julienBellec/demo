package fr.jbellec.common;

public interface ObjectFactory<T> {
    public T newObject(String[] parts);
}
