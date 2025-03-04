package behavior_patterns.stategy.example1;

import java.io.File;
import java.math.BigDecimal;

public class TransferPayment implements  PaymentStrategy {

    private File voucher;

    public TransferPayment(File voucher) {
        this.voucher = voucher;
    }

    @Override
    public void pay(BigDecimal amount) {
        System.out.println("***** Payment with voucher\n Total Amount: " + amount +  " \nVoucher:  " + voucher);
    }
}
