package fr.jbellec.kata.conwaygame;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ConwayGameTest {

    @Test
    @DisplayName("Création et affichage de la grille")
    void creation_grille() {
        Grid grid = new Grid("........" + "\n" + "........" + "\n");
        assertEquals("........" + "\n" + "........" + "\n" , grid.toString());
    }


    @Test
    void appliquer_regle_sous_population() {
        Grid grid = new Grid(".*......" + "\n" + "........" + "\n" + "........" + "\n" + "........" + "\n" + "........" + "\n");
        grid.appliquerRegle();
        assertEquals("........" + "\n" + "........" + "\n" + "........" + "\n" + "........" + "\n" + "........" + "\n", grid.toString());
    }

    @Test
    void appliquer_regle_sous_population_2() {
        Grid grid = new Grid(".**....." + "\n" + ".**....." + "\n" + "........" + "\n" + "........" + "\n" + "....***." + "\n");
        grid.appliquerRegle();
        assertEquals(".**....." + "\n" + ".**....." + "\n" + "........" + "\n" + "........" + "\n" + ".....*.." + "\n", grid.toString());
    }

}
