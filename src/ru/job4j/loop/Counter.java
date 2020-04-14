package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum;
        for (sum = start; sum <= finish; sum++) {
            sum = sum + finish;
        }
        return sum;
    }

   public static int sumByEven(int start, int finish) {
        int sum = 0;
       int sum1;
        for (sum1 = start; sum1 <= finish; sum1++) {
            if ((sum1 % 2) == 0) {
                sum = sum + sum1;
            }
        }


        return sum;
    }

    public static void main(String[] args) {
        //Counter a = new Counter();
        /*System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(Counter.sum(1, 10));
        System.out.println(Counter.sum(3, 8));
        System.out.println(Counter.sum(1, 1));
        System.out.println(sumByEven(1 , 10));*/

    }
}
