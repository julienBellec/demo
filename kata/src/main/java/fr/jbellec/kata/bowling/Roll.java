package fr.jbellec.kata.bowling;

import static java.lang.Integer.parseInt;

public class Roll {

    private static final String MISS = "-";

    private static final String SPARE = "/";

    private static final String STRIKE = "X";

    public boolean isStrike() {
        return isStrike;
    }

    private final boolean isStrike;

    private int firstShoot;

    private int secondShoot;

    public boolean isSpare() {
        return isSpare;
    }

    private boolean isSpare;

    public Roll(String roolResult) {

        isStrike = roolResult.startsWith(STRIKE);
        if (!isStrike) {
            this.firstShoot = getValueShoot(roolResult.substring(0, 1));
            this.secondShoot = getValueShoot(roolResult.substring(1, 2));
            isSpare = roolResult.endsWith(SPARE);
        }

    }

    private int getValueShoot(String shoot) {
        return (STRIKE.equals(shoot) || SPARE.equals(shoot) || MISS.equals(shoot)) ? 0 : parseInt(shoot);
    }

    public Integer getScore() {
        return (isStrike || isSpare) ? 10 : firstShoot + secondShoot;
    }

    public int getSpareBonus() {
        return isStrike ? 10 : firstShoot;
    }

    public int getSrtikeBonus() {
        return this.getScore();
    }

}
