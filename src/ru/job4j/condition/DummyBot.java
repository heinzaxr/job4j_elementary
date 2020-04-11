package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Сколько будет 2 + 2?".equals(question)) {
            rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }

        return rsl;
    }

}