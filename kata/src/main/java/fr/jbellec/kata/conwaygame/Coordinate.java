package fr.jbellec.kata.conwaygame;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Coordinate {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public List<Coordinate> getNeigboursCoordnoates(){
        List<Coordinate> neigboursCoordonates = new ArrayList<>();
        neigboursCoordonates.add(new Coordinate(x-1, y-1));
        neigboursCoordonates.add(new Coordinate(x, y-1));
        neigboursCoordonates.add(new Coordinate(x+1, y-1));

        neigboursCoordonates.add(new Coordinate(x-1, y));
        neigboursCoordonates.add(new Coordinate(x+1, y));

        neigboursCoordonates.add(new Coordinate(x-1, y+1));
        neigboursCoordonates.add(new Coordinate(x, y+1));
        neigboursCoordonates.add(new Coordinate(x+1, y+1));

        return neigboursCoordonates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Coordinate that = (Coordinate) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
