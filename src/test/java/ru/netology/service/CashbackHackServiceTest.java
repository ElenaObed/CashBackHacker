package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CashbackHackServiceTest {

    @org.junit.jupiter.api.Test
    public void shouldTestRemainAdd100() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @org.junit.jupiter.api.Test
    public void shouldTestRemainAddZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }
}

