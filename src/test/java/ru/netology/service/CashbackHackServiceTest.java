package ru.netology.service;

import org.testng.Assert;
import static org.testng.Assert.assertEquals;


public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void shouldTestRemainAdd100() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void shouldTestRemainAddZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }
}

