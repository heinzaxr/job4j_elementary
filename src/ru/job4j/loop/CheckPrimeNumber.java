package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        int index;
        for (index = 2; index <= number; number++) {
            if ((number % index) == 0) {
                prime = false;
                break;
            }
            else if (number > index)
                break;
        }
            return prime;
        }

    }
