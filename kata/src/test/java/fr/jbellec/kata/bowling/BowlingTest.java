package fr.jbellec.kata.bowling;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BowlingTest {

    @Test
    void getScoreForSimpleRolls() {
        Bowling bowling = new Bowling("12 12 12 12 12 12 12 12 12 12");
        assertEquals(30, bowling.getScore());
    }

    @Test
    void getScoreForSimpleRollsWithAMiss() {
        Bowling bowling = new Bowling("9- 9- 9- 9- 9- 9- 9- 9- 9- 9-");
        assertEquals(90, bowling.getScore());
    }

    @Test
    void getScoreForSimpleRollsWithASpare() {
        Bowling bowling = new Bowling("9/ 9- 9- 9- 9- 9- 9- 9- 9- 9-");
        assertEquals(100, bowling.getScore());
    }

    @Test
    void getScoreForSimpleRollsWithAStrike() {
        Bowling bowling = new Bowling("9/ 9- X 23 9- 9- 9- 9- 9- 9-");
        assertEquals(111, bowling.getScore());
    }

    @Test
    void getScoreForSimpleRollsWithAStrikeAndASpare() {
        Bowling bowling = new Bowling("9/ X X 23 9- 9- 9- 9- 9- 9-");
        assertEquals(128, bowling.getScore());
    }

    @Test
    void getScoreForSimpleRollsWithAllStrikes() {
        Bowling bowling = new Bowling("X X X X X X X X X X X X");
        assertEquals(300, bowling.getScore());
    }

}
