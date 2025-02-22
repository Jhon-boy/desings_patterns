package creational_patterns.factory_method;
/**
 * Interface that defines the contract for payment processing methods.
 * Each payment method must implement this interface to handle payment processing.
 */
public interface MetodoPago {

    void processPay(double price);
}
