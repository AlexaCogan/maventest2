package maventest2.matchJUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static java.lang.String.valueOf;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentBankAccount {
    private PaymentBankAccount paymentBankAccount;

    public PaymentBankAccount(String artem, String sokovets, String valueOf) {
    }

    private String getFirstName() {
        String FirstName = null;
        return FirstName;
    }

    private String getLastName() {
        String LastName = null;
        return LastName;
    }

    private Integer getBalance() {
        Integer Balance = null;
        return Balance;
    }

    @BeforeEach
    void setUp() {
        paymentBankAccount = new PaymentBankAccount("Artem", "Sokovets", valueOf(1230000000L));
    }

    @Test
    void shouldBeWitoutMatchersValidParamsOfPaymentBankAccount() {
        assertNotNull(paymentBankAccount, "Object is null");
        assertEquals("Ivan", paymentBankAccount.getFirstName(), "Имя не совпадает");
        assertTrue("Sokovets".equalsIgnoreCase(paymentBankAccount.getLastName()),"Фамилия не совпадает");
        assertTrue(valueOf(1230000000L).equals(paymentBankAccount.getBalance()), "Баланс не совпадает");
    }


    

}
