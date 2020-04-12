package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (sum = start; sum <= finish; sum++) {
            sum = sum + finish;
        }
        return sum;
    }

    public static void main(String[] args) {
        Counter a = new Counter();
        /*System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1)); */
        System.out.println(Counter.sum(0, 10));
        System.out.println(Counter.sum(3, 8));
        System.out.println(Counter.sum(1, 1));
    }
}
