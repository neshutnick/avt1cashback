package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnWhenAmountUnderBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnWhenAmountOverBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;
        int expected = 900;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }
     
     @Test
    public void shouldReturnWhenAmountEqualBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }
} 