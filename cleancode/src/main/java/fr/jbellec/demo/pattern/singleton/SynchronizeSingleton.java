package fr.jbellec.demo.pattern.singleton;

public class SynchronizeSingleton {
	/** Constructeur privé */
	private SynchronizeSingleton() {
	}

	private static SynchronizeSingleton INSTANCE = null;

	/** Point d'accès pour l'instance unique du singleton */
	public static synchronized SynchronizeSingleton getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SynchronizeSingleton();
		}
		return INSTANCE;
	}
}