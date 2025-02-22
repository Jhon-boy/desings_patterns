package creational_patterns.factory_method;

import java.math.BigDecimal;

/**
 * Implementation of bank transfer payment processing.
 * Handles calculations including VAT and commission fees for bank transfers.
 */
public class Transfer implements MetodoPago {

    @Override
    public void processPay(double price) {
        Double iva = Double.valueOf(15);
        Double commision = Double.valueOf(0.36);
        System.out.println("**********************");
        System.out.println("Unit Price: " + price);
        System.out.println("Iva: " + iva);
        System.out.println("Commision: " + commision);
        System.out.println("-----------------------");
        BigDecimal totalPrice = BigDecimal.valueOf( (price + ((price * iva)/ 100)) + commision);
        System.out.println("TOTAL: " + totalPrice);
    }
}
