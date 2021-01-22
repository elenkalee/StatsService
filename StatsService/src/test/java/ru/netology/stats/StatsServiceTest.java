package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    void shouldCalculateSum() {
        assertEquals(180, service.calculateSum(purchases));
    }


    @Test
    void shouldCalculateAverage () {
        assertEquals(15,service.calculateAverage(purchases));
    }

    @Test
    void shouldFindMaxMonth () {
        assertEquals(8, service.findMaxMonth(purchases));
    }

    @Test
    void shouldFindMinMonth () {
        assertEquals(9, service.findMinMonth(purchases));
    }

    @Test
    void shouldCalculateNumberMonthsMoreThanAvg () {
        assertEquals(5, service.numberMonthMoreThanAvg(purchases));
    }

    @Test
    void shouldCalculateNumberMonthsLessThanAvg () {
        assertEquals(5, service.numberMonthLessThanAvg(purchases));
    }
}