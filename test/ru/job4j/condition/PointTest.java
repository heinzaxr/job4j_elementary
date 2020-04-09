package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.converter.Converter;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance() {
        int x1 = 3;
        int y1 = 3;
        int x2 = 3;
        int y2 = 3;
        int expected = 0;
        int out = (int) Point.distance(x1 , y1 , x2 , y2);
        Assert.assertEquals(expected, out);


    }
}

