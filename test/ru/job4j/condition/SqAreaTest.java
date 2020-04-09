package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.converter.Converter;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void square() {

        int x = 4;
        int y = 1;
        int expected = 1;
        int out = (int) SqArea.square(x, y);
        Assert.assertEquals(expected, out);
    }
}