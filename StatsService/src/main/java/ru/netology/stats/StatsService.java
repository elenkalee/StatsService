package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }


    public int calculateAverage (int[] purchases) {
        int calculateSum = calculateSum(purchases);
        int average = calculateSum / purchases.length;
        return average;
    }

    public int findMaxMonth (int[] purchases) {
        int max = purchases[0];
        for (int purchase : purchases) {
            if (max < purchase) {
                max = purchase;
            }
        }
            int findMaxMonth = 0;
            int monthNumber = 0;
            for (int purchase : purchases) {
                monthNumber++;
                if (purchase == max) {
                    findMaxMonth = monthNumber;
                }
            }
            return findMaxMonth;
    }

    public int findMinMonth (int[] purchases) {
        int min = purchases[0];
        for (int purchase : purchases) {
            if (min > purchase) {
                min = purchase;
            }
        }
        int findMinMonth = 0;
        int monthNumber = 0;
        for (int purchase : purchases) {
            monthNumber++;
            if (purchase == min) {
                findMinMonth = monthNumber;
            }
        }
        return findMinMonth;
    }

    public int numberMonthMoreThanAvg (int[] purchases) {
        int calculateAverage = calculateAverage(purchases);
        int monthNumber = 0;
        for (int purchase : purchases) {
            if (purchase > calculateAverage) {
                monthNumber++;
            }
        }
        return monthNumber;
        }

    public int numberMonthLessThanAvg (int[] purchases) {
        int calculateAverage = calculateAverage(purchases);
        int monthNumber = 0;
            for (int purchase : purchases) {
                if (purchase < calculateAverage) {
                    monthNumber++;
                }
            }
            return monthNumber;
        }
    }
