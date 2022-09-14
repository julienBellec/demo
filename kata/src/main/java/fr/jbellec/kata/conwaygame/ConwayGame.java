package fr.jbellec.kata.conwaygame;

public class ConwayGame {
    public static void main(String[] args) {
        Grid grid = new Grid(".***...." + "\n" + ".***...." + "\n" + ".***...." + "\n" + "........" + "\n" + "........" + "\n");
        System.out.println("Initial FRID");
        System.out.println(grid);

        for (int i = 1; i < 20; i++) {
            System.out.println("Generation nb " + i);
            grid.appliquerRegle();
            System.out.println(grid);

        }


    }

}
