package creational_patterns.factory_method;

/**
 * Implementation of credit card payment processing.
 * Handles the specific logic for processing payments via credit card.
 */

public class CardCredit implements MetodoPago {

    @Override
    public void processPay(double price) {
        Double totalPrice = Double.valueOf(price) * 5;
        System.out.println("TOTAL PAY: " + totalPrice);
    }
}
