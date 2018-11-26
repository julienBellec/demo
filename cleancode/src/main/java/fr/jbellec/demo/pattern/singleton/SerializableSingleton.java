package fr.jbellec.demo.pattern.singleton;

public class SerializableSingleton {
	/** Constructeur privé */
	private SerializableSingleton() {
	}

	/** Instance unique pré-initialisée */
	private static SerializableSingleton INSTANCE = new SerializableSingleton();

	/** Point d'accès pour l'instance unique du singleton */
	public static SerializableSingleton getInstance() {
		return INSTANCE;
	}

	/** Sécurité anti-désérialisation */
	private Object readResolve() {
		return INSTANCE;
	}
}