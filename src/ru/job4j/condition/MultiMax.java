package ru.job4j.condition;

public class MultiMax {

    public int max(int first, int second, int third) {
        boolean cond1 = first > second;
        int result1 = cond1 ? first : second;
        boolean cond2 = result1 > third;
        int result = cond2 ? result1 : third;
        return result;
    }
}
