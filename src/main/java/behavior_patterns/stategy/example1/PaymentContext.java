package behavior_patterns.stategy.example1;

import java.math.BigDecimal;

/**
 * Create Context Payment
 * */
public class PaymentContext {

    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy){
        this.strategy = strategy;
    }

    public void executePayment(BigDecimal amount){
        if(strategy == null){
            System.out.println("No payment method configured");
        } else {
            strategy.pay(amount);
        }
    }
}
