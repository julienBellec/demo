package fr.jbellec.kata.bowling;

import java.util.ArrayList;

import static java.util.Arrays.stream;

public class Bowling {

    private final ArrayList<Roll> rolls = new ArrayList<>();

    public Bowling(String result) {
        stream(result.split(" ")).forEach(rollResult -> rolls.add(new Roll(rollResult)));
    }

    public int getScore() {
        int score = 0;
        for (int i = 0; i < rolls.size(); i++) {
            Roll roll = rolls.get(i);
            score += roll.getScore();
            if (i < 9) {
                if (roll.isSpare()) {
                    score += applyBonusSpare(i);
                }
                if (roll.isStrike()) {
                    score += applyBonusStrike(i);
                }

            }
        }
        return score;
    }

    private int applyBonusSpare(int i) {
        return rolls.get(i + 1).getSpareBonus();
    }

    private int applyBonusStrike(int i) {
        int bonus = rolls.get(i + 1).getSrtikeBonus();
        if (i < 9) {
            bonus += rolls.get(i + 2).getSrtikeBonus();
        }
        return bonus;
    }

}
