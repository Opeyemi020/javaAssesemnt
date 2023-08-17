package opeAssesement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OpeAccountTest{
    @Test
    public void testThatAccountExist(){
        OpeAccount account = new OpeAccount();
        assertNotNull(account);
    }
    @Test
    public void testThatMoneyCanBeDepositedIntoAccount(){
        OpeAccount account = new OpeAccount();
        account.deposit(500);
        assertEquals(500, account.getBalance());
    }
    @Test
    public void testThatMoneyCanBeDepositedMultipleTimes(){
        OpeAccount account = new OpeAccount();
        account.deposit(550);
        account.deposit(100);
        account.deposit(500);
        assertEquals(1150, account.getBalance());
    }
    @Test
    public void testThatMoneyCanBeWithdraw(){
        OpeAccount account = new OpeAccount();
        account.deposit(500);
        account.deposit(1000);
        account.deposit(500);
        account.deposit(100);
        account.deposit(200);
        account.withdraw(500);
        assertEquals(1800, account.getBalance());
}
    @Test
    public void testThatMoneyCanBeTransferToAnotherAccount(){
        OpeAccount account = new OpeAccount();
        OpeAccount myAccount = new OpeAccount();
        account.deposit(3000);
        account.transfer(3000);
        assertEquals(0,account.getBalance());
        myAccount.deposit(3000);
        assertEquals(3000,myAccount.getBalance());

    }
}

