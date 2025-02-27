package structural_patterns.proxy.example2;

import java.math.BigDecimal;

public class RealAccount implements BanckAcount {

    private BigDecimal balance;
    public RealAccount(BigDecimal balance) {
        this.balance = balance;
    }


    @Override
    public void withdraw(BigDecimal amount) {
        int result = amount.compareTo(balance);
        if(result > 0){
            System.out.println("Insufficient funds");
        } else {
            balance = balance.subtract(amount);
            System.out.println("Withdrawn " + amount + ", remaining balance: " + balance);
        }
    }
}
