package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {
    @Test
    public void testDeposit_ShouldReturnTrueAndBalanceShouldBeCorrect(){
        //Given
        Account account = new Account();

        //When
        account.deposit(1000F);
        boolean depositResult = account.deposit(1500F);
        float checkBalanceResult = account.checkBalance();

        //Then
        Assertions.assertTrue(depositResult);
        Assertions.assertEquals(2500, checkBalanceResult);
    }

    @Test
    public void testDeposit_WhenAmountNotValid_ShouldReturnFalseAndBalanceShouldNotChange(){
        //Given
        Account account = new Account();

        //When
        account.deposit(1000F);
        boolean depositResult = account.deposit(-1500F);
        float checkBalanceResult = account.checkBalance();

        //Then
        Assertions.assertTrue(depositResult);
        Assertions.assertEquals(1000, checkBalanceResult);
    }
}
