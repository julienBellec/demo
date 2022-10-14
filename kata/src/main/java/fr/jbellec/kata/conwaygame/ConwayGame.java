package fr.jbellec.kata.conwaygame;

import java.util.logging.Logger;

import static java.lang.String.format;

public class ConwayGame {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(ConwayGame.class.getName());
        Grid grid = new Grid(".***...." + "\n" + ".***...." + "\n" + ".***...." + "\n" + "........" + "\n" + "........" + "\n");
        logger.info("Initial GRID");
        logger.info("\n" +grid.toString());

        for (int i = 1; i < 15; i++) {

            logger.info(format("Generation nb %d", i));
            grid.appliquerRegle();
            logger.info("\n" +grid.toString());

        }


    }

}
