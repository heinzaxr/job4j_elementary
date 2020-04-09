package ru.job4j.calculator;

import org.junit.Test;
import ru.job4j.converter.Converter;

import org.junit.Assert;

public class FitTest {

    @Test
    public void manWeight() {
        double in = 200;
        double expected = 115;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight() {
        double in = 300;
        double expected = 218.5;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}