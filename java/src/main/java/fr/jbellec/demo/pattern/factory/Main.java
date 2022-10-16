package fr.jbellec.demo.pattern.factory;

public class Main {

	
	public static void main(String[] args) {
		Point point = CanevasFactory.getPoint(1,2);
		System.out.print(point.getX() + " " + point.getY());
	}

}
