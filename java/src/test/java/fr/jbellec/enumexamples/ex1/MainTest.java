package fr.jbellec.enumexamples.ex1;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void test() {

        Main main = new Main();
        assertFalse(main.isWeekEnd(Days.MONDAY));
        assertFalse(main.isWeekEnd(Days.MONDAY));
        assertFalse(main.isWeekEnd(Days.THUESDAY));
        assertFalse(main.isWeekEnd(Days.WEDNESDAY));
        assertFalse(main.isWeekEnd(Days.THURSDAY));
        assertFalse(main.isWeekEnd(Days.FRIDAY));
        assertTrue(main.isWeekEnd(Days.SUNDAY));
        assertTrue(main.isWeekEnd(Days.SATURDAY));
    }

}
