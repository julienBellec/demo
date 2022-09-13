package fr.jbellec.kata.conwaygame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Grid {

    private HashMap<Coordinate, Cell> gridCoordinatesCells = new HashMap<>();

    public Grid(String initialGrid) {
        int y = 0;
        for (String line : initialGrid.split("\n")) {
            generateCell(y, 0, line);
            y++;
        }
    }

    private void generateCell(final int y, final int x, final String line) {
        gridCoordinatesCells.put(new Coordinate(x, y), new Cell(line.substring(x, x + 1)));
        if (line.length() > x + 1) {
            generateCell(y, x + 1, line);
        }
    }

    @Override
    public String toString() {
        return linesToString(0);
    }
    private String linesToString(final int startLineNumber) {
        String line = lineToString(startLineNumber);
        if (gridCoordinatesCells.containsKey(new Coordinate(0, startLineNumber + 1))){
            return line + linesToString(startLineNumber + 1);
        }
        return line;
    }
    private String lineToString(final int lineNumber) {
        Coordinate coordinate = new Coordinate(0, lineNumber);
        if (gridCoordinatesCells.containsKey(coordinate)) {
            return gridCoordinatesCells.get(coordinate).toString() + cellsOfLineToString(1, lineNumber);
        }
        return "\n";
    }

    private String cellsOfLineToString(int x, int lineNumber) {
        Coordinate coordonate = new Coordinate(x, lineNumber);
        if (gridCoordinatesCells.containsKey(coordonate)) {
            return gridCoordinatesCells.get(coordonate).toString() + cellsOfLineToString(x + 1, lineNumber);
        }
        return "\n";
    }

    public void appliquerRegle() {
        HashMap<Coordinate, Cell> gridAfterRule = new HashMap<>();
        gridCoordinatesCells.keySet().forEach(coordonate -> applyRuleUnderPopulation(gridAfterRule, coordonate));
        gridCoordinatesCells.putAll(gridAfterRule);
    }

    private void applyRuleUnderPopulation(HashMap<Coordinate, Cell> gridAfterRule, Coordinate coordinate) {
        Cell cell = gridCoordinatesCells.get(coordinate);
        if (cell.isDead()) {
            gridAfterRule.put(coordinate, new Cell(cell.isAlive()));
            return;
        }
        gridAfterRule.put(coordinate, new Cell(getNbALiveNeighbours(coordinate) >= 2));
    }

    private long getNbALiveNeighbours(Coordinate coordinate) {
        return getNeighbours(coordinate).stream().filter(Cell::isAlive).count();
    }

    private List<Cell> getNeighbours(final Coordinate coordinate) {
        List<Cell> neighbours = new ArrayList<>();
        coordinate.getNeigboursCoordnoates().forEach(c -> addNeighbour(c, neighbours));
        return neighbours;
    }

    private void addNeighbour(Coordinate neighbourCoordinate, List<Cell> neighbours) {
        if (gridCoordinatesCells.containsKey(neighbourCoordinate)) {
            neighbours.add(gridCoordinatesCells.get(neighbourCoordinate));
        }
    }

}
