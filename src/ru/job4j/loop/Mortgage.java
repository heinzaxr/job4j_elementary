package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 1;
        double percent1 = percent / 100;
        double amount1 = (double) (amount + amount * percent1);
        while (amount1 - salary > 0) {
            amount1 = (double) (amount1 + amount1 * percent1) - salary;
            year++;


        }

        return year;
    }
}

