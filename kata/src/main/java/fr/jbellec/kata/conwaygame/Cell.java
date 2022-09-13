package fr.jbellec.kata.conwaygame;

public class Cell {

    public Cell(String substring) {
        this.isAlive = "*".equals(substring);
    }

    public boolean isAlive() {
        return isAlive;
    }

    public boolean isDead() {
        return !isAlive;
    }

    private boolean isAlive;

    public Cell( char character) {
        this.isAlive = '*' == character;
    }

    public Cell( boolean isAlive) {
        this.isAlive = isAlive;
    }

    @Override
    public String toString() {
        return  isAlive ? "*" : ".";
    }
}
