package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        int i;
        for (i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }

   public static int sumByEven(int start, int finish) {
        int sum = 0;
       int index;
        for (index = start; index <= finish; index++) {
            if ((index % 2) == 0) {
                sum = sum + index;
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
