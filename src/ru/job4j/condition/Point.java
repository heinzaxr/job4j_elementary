package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int x = x1 - x2;
        int y = y1 - y2;
        double first = Math.pow(x, 2);
        double second = Math.pow(y, 2);
        double firstAndSecond = first + second;
        double rsl = Math.sqrt(firstAndSecond);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(3, 5, 2, 3);
        System.out.println("result (3, 5) to (2, 3) " + result);
    }

}
