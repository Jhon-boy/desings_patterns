package behavior_patterns.stategy.example1;

import java.math.BigDecimal;

public class CreditCardPayment implements PaymentStrategy {

    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(BigDecimal amount) {
        System.out.println("***PAYMENT WITH CARD\n -  TOTAL AMOUNT: " + amount + "\nNumber Card: " + cardNumber);
    }
}
