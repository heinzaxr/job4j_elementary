package ru.job4j.converter;
/**
*Currency converter
*
*@author Alexandr Geynts (heinz-axr@ya.ru)
*
 */

public class Converter {
    /**
     * Method rubleToEuro
    *@param value of the Euro currency
    *@return amount in roubles
    */
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }
    /**
     * Method  rubleToDollar
     *@param value of the Dollar currency
     *@return amount in roubles
     */
    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    /**
    * Method Main
    *@param args
    */

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);

        in = 120;
        expected = 2;
        int out1 = rubleToDollar(in);
        passed = expected == out1;
        System.out.println("120 rubles are 2 dollars. Test result : " + passed);
    }
}
