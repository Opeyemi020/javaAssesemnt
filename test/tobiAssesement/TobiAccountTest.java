package tobiAssesement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TobiAccountTest {
@Test
    public void testThatAccountExist(){
    TobiAccount account = new TobiAccount();
        assertNotNull(account);
    }
    @Test
    public void testThatAccountCanDeposit(){
    TobiAccount account = new TobiAccount();
    account.deposit(500);
    assertEquals(500,account.getBalance());
    }
    @Test
    public void testThatAccountCanWithdraw(){
    TobiAccount account = new TobiAccount();
    account.deposit(1000);
    account.deposit(500);
    account.deposit(200);
    account.withdraw(1000);
    assertEquals(700,account.getBalance());
    }
    @Test
    public void testThatMoneyCanBeTransferFromAccount(){
    TobiAccount account = new TobiAccount();
    TobiAccount zenithAccount = new TobiAccount();
    account.deposit(2500);
    assertEquals(2500,account.getBalance());
    zenithAccount.deposit(500);
    account.transferTo(zenithAccount,2500);
    assertEquals(3000,zenithAccount.getBalance());
    }
}


