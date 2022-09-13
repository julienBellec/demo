package fr.jbellec.kata.leapyear;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LeapYearTest {

    @ParameterizedTest
    @CsvSource({"400,true", "100,false", "200,false", "800,true", "2000,true", "1700, false", "1800, false", "1900, false", "2008, true", "2012, true", "2016, true"})
    void testIsLeapYear(int year, String isLeapYear) {
        assertEquals(Boolean.valueOf(isLeapYear), LeapYear.isLeapYear(year));
    }

}
