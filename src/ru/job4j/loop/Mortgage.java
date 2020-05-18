package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double percent1 = percent / 100;

        while (amount > 0) {
            amount = (int) ((double) (amount + amount * percent1) - salary);
            year++;


        }

        return year;
    }
}

