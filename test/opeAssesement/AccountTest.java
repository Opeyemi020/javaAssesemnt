package opeAssesement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {


    @Test
    public void testThatAccountExist(){
        Account account = new Account();
        assertNotNull(account);
    }
    @Test
    public void testThatWeCanDepositToAccount(){
        //Given
        Account account = new Account();
        //when
        account.deposit(500);
        //assert
        assertEquals(500,account.getBalance());
    }
    @Test
    public void testThatWeCanWithdrawFromAccount(){
        Account account = new Account();
        account.deposit(1000);
        account.withdraw(500);
        assertEquals(500,account.getBalance());
    }
}