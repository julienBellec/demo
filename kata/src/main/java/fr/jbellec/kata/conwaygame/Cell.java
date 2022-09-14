package fr.jbellec.kata.conwaygame;

public class Cell {

    public Cell(String substring) {
        this.isAlive = "*".equals(substring);
    }

    public boolean isAlive() {
        return isAlive;
    }

    private boolean isAlive;

    public Cell( boolean isAlive) {
        this.isAlive = isAlive;
    }

    @Override
    public String toString() {
        return  isAlive ? "*" : ".";
    }
}
