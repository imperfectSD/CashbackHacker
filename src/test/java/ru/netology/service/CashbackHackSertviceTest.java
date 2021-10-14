package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackSertviceTest {

    @org.testng.annotations.Test
    public void shouldRemain100IfAmountIs900() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldRemain500IfAmountIs1500() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1500;

        int actual = cashbackHackService.remain(amount);
        int expected = 500;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldRemain500IfAmountIs500() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 500;

        int actual = cashbackHackService.remain(amount);
        int expected = 500;

        assertEquals(actual, expected);
    }
}
