package ru.netology.service;

//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//import org.testng.annotations.Test;
//
//import static org.testng.Assert.*;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculate() { //проверка работы сервиса на положительную величину меньше 1000 руб
        CashbackHackService service = new CashbackHackService();
        int amount=900;

        int actual=service.remain(amount);
        int expected=100;

        assertEquals(actual, expected);
    }
    @Test
    public void shouldCalculateMin() { //проверка работы сервиса на нулевую сумму
        CashbackHackService service = new CashbackHackService();
        int amount=0;

        int actual=service.remain(amount);
        int expected=1000;

        assertEquals(actual, expected);
    }
    @Test
    public void shouldCalculateMax() { //покупка ровно на 1000 руб
        CashbackHackService service = new CashbackHackService();
        int amount=1_000;

        int actual=service.remain(amount);
        int expected=0;

        assertEquals(actual, expected);
    }
    @Test
    public void shouldCalculateMaxMax() { //покупка ровно на 1001 руб
        CashbackHackService service = new CashbackHackService();
        int amount=1_001;

        int actual=service.remain(amount);
        int expected=999;

        assertEquals(actual, expected);
    }
}