package fr.jbellec.patterns.singleton;

/**
 * Implémentation simple d'un singleton. L'instance est créée à
 * l'initialisation.
 */
public class BasicSingleton {
	/**
	 * Constructeur privé
	 */
	private BasicSingleton() {
	}

	/**
	 * Instance unique pré-initialisée
	 */
	private static BasicSingleton INSTANCE = new BasicSingleton();

	/**
	 * Point d'accès pour l'instance unique du singleton
	 */
	public static BasicSingleton getInstance() {
		return INSTANCE;
	}
}
