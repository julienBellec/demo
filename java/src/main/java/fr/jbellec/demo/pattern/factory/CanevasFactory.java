package fr.jbellec.demo.pattern.factory;

public class CanevasFactory {

	private CanevasFactory() {
		throw new IllegalStateException("CanevasFactory class");
	}

	public static Point getPoint(int x, int y) {
		return new PointImpl(x, y);
	}

}
