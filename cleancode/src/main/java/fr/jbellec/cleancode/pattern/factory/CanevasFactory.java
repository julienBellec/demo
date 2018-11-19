package fr.jbellec.cleancode.pattern.factory;

public class CanevasFactory {

	public static Point getPoint(int x, int y) {
		return new PointImpl(x, y);
	}

}
