package behavior_patterns.stategy.example1;

import java.io.File;
import java.math.BigDecimal;

public class TestMain {

    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();
        System.out.println("Paying Netflix suspcriptions");
        paymentContext.setPaymentStrategy(new CreditCardPayment("87545454"));
        paymentContext.executePayment(BigDecimal.valueOf(451));

        System.out.println("---------------------------\n Paying Amazon web services");
        paymentContext.setPaymentStrategy(new TransferPayment(new File("C:\\Users\\Jhon\\Pictures\\fondo.jpg")));
        paymentContext.executePayment(BigDecimal.valueOf(4541));

    }
}
