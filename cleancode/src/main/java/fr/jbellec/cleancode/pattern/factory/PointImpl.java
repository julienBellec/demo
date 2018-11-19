package fr.jbellec.cleancode.pattern.factory;

public class PointImpl implements Point {

	int x;
	int y;

	public PointImpl(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}
