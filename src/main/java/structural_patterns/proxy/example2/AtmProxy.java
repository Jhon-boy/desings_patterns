package structural_patterns.proxy.example2;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class AtmProxy implements  BanckAcount {
    private RealAccount realAccount;

    private static  final Map<String, String> pinDatabase = new HashMap<>();
    static  {
        pinDatabase.put("4578", "7844");
        pinDatabase.put("4572", "1111");
    }

    private String cardNumber;
    private boolean authenticated = false;

    public  AtmProxy(String cardNumber, BigDecimal initialBalance){
        this.cardNumber = cardNumber;
        this.realAccount = new RealAccount(initialBalance);
    }

    private  boolean authenticated(String ping){
        return pinDatabase.containsKey(cardNumber) && pinDatabase.get(cardNumber).equals(ping);
    }
    public  void enterPin(String pin){
        if(authenticated(pin)){
            System.out.println("Authentication succesfully....");
            authenticated   = true;
        } else {
            System.out.println("Fail authentication, retry again");
        }
    }

    @Override
    public void withdraw(BigDecimal amount) {
        if(!authenticated){
            System.out.println("Please enter the Pin first.");
            return;
        }
        realAccount.withdraw(amount);
    }
}
