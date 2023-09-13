package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DateSorterTest {
    private DateSorter dateSorter;
    private List<LocalDate> testList;
    private List<LocalDate> expectedList;

    @BeforeEach
    void setUp() {
        dateSorter = new DateSorter();
        testList = new ArrayList<>();
        expectedList = new ArrayList<>();
    }

    @Test
    void sortDates_firstTestCase() {
        //Given
        testList.add(LocalDate.parse("2005-07-01"));
        testList.add(LocalDate.parse("2005-01-02"));
        testList.add(LocalDate.parse("2005-01-01"));
        testList.add(LocalDate.parse("2005-05-03"));

        expectedList.add(LocalDate.parse("2005-01-01"));
        expectedList.add(LocalDate.parse("2005-01-02"));
        expectedList.add(LocalDate.parse("2005-07-01"));
        expectedList.add(LocalDate.parse("2005-05-03"));

        //When
        Collection<LocalDate> actualList = dateSorter.sortDates(testList);

        //Then
        assertEquals(expectedList, actualList);
    }


    @Test
    void sortDates_secondTestCase() {
        //Given
        testList.add(LocalDate.parse("2005-07-01"));
        testList.add(LocalDate.parse("2005-01-02"));
        testList.add(LocalDate.parse("2005-01-01"));
        testList.add(LocalDate.parse("2005-03-03"));
        testList.add(LocalDate.parse("2005-02-09"));
        testList.add(LocalDate.parse("2005-02-03"));
        testList.add(LocalDate.parse("2005-04-03"));
        testList.add(LocalDate.parse("2005-05-03"));
        testList.add(LocalDate.parse("2005-06-03"));

        expectedList.add(LocalDate.parse("2005-01-01"));
        expectedList.add(LocalDate.parse("2005-01-02"));
        expectedList.add(LocalDate.parse("2005-02-03"));
        expectedList.add(LocalDate.parse("2005-02-09"));
        expectedList.add(LocalDate.parse("2005-03-03"));
        expectedList.add(LocalDate.parse("2005-04-03"));
        expectedList.add(LocalDate.parse("2005-07-01"));
        expectedList.add(LocalDate.parse("2005-06-03"));
        expectedList.add(LocalDate.parse("2005-05-03"));

        //When
        Collection<LocalDate> actualList = dateSorter.sortDates(testList);

        //Then
        assertEquals(expectedList, actualList);
    }

    @Test
    void sortDates_thirdTestCase() {
        //Given
        testList.add(LocalDate.parse("2005-07-01"));
        testList.add(LocalDate.parse("2005-01-02"));
        testList.add(LocalDate.parse("2005-01-01"));
        testList.add(LocalDate.parse("2005-03-03"));
        testList.add(LocalDate.parse("2005-02-06"));
        testList.add(LocalDate.parse("2005-02-09"));
        testList.add(LocalDate.parse("2005-04-07"));
        testList.add(LocalDate.parse("2005-05-01"));
        testList.add(LocalDate.parse("2005-06-04"));
        testList.add(LocalDate.parse("2005-07-02"));
        testList.add(LocalDate.parse("2005-08-08"));
        testList.add(LocalDate.parse("2005-08-15"));
        testList.add(LocalDate.parse("2005-09-01"));
        testList.add(LocalDate.parse("2005-10-11"));
        testList.add(LocalDate.parse("2005-11-12"));
        testList.add(LocalDate.parse("2005-12-20"));
        testList.add(LocalDate.parse("2005-08-30"));
        testList.add(LocalDate.parse("2005-10-03"));
        testList.add(LocalDate.parse("2005-11-27"));
        testList.add(LocalDate.parse("2005-04-11"));
        testList.add(LocalDate.parse("2005-09-28"));
        testList.add(LocalDate.parse("2005-11-22"));
        testList.add(LocalDate.parse("2005-12-29"));

        expectedList.add(LocalDate.parse("2005-01-01"));
        expectedList.add(LocalDate.parse("2005-01-02"));
        expectedList.add(LocalDate.parse("2005-02-06"));
        expectedList.add(LocalDate.parse("2005-02-09"));
        expectedList.add(LocalDate.parse("2005-03-03"));
        expectedList.add(LocalDate.parse("2005-04-07"));
        expectedList.add(LocalDate.parse("2005-04-11"));
        expectedList.add(LocalDate.parse("2005-09-01"));
        expectedList.add(LocalDate.parse("2005-09-28"));
        expectedList.add(LocalDate.parse("2005-10-03"));
        expectedList.add(LocalDate.parse("2005-10-11"));
        expectedList.add(LocalDate.parse("2005-11-12"));
        expectedList.add(LocalDate.parse("2005-11-22"));
        expectedList.add(LocalDate.parse("2005-11-27"));
        expectedList.add(LocalDate.parse("2005-12-20"));
        expectedList.add(LocalDate.parse("2005-12-29"));
        expectedList.add(LocalDate.parse("2005-08-30"));
        expectedList.add(LocalDate.parse("2005-08-15"));
        expectedList.add(LocalDate.parse("2005-08-08"));
        expectedList.add(LocalDate.parse("2005-07-02"));
        expectedList.add(LocalDate.parse("2005-07-01"));
        expectedList.add(LocalDate.parse("2005-06-04"));
        expectedList.add(LocalDate.parse("2005-05-01"));

        //When
        Collection<LocalDate> actualList = dateSorter.sortDates(testList);

        //Then
        assertEquals(expectedList, actualList);
    }
}