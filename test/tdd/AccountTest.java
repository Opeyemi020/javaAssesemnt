package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void testThatAccountExist(){
        //Given
        Account account = new Account();
        assertNotNull(account);

    }
    @Test
    void testThatAccountCanDeposit(){
        Account account = new Account();
        int balance = account.checkBalance();
        assertEquals(0, balance);

        account.deposit(5000);

        int newBalance = account.checkBalance();
        assertEquals(5000, newBalance);
    }


}