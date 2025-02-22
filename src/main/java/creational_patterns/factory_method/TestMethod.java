package creational_patterns.factory_method;

import creational_patterns.factory_method.factory.CardCreditFactory;
import creational_patterns.factory_method.factory.TransferFactory;

public class TestMethod  {

    public static void main(String [] args) {
     // Create instances of concrete factories
        System.out.println("------------- FACTORY METHOD INIT -----------------");
        MetodoPago transfer = new TransferFactory().createMethodPay();
        MetodoPago cardCredit = new CardCreditFactory().createMethodPay();
        transfer.processPay(4.50);
        cardCredit.processPay(5.20);

    }
}
