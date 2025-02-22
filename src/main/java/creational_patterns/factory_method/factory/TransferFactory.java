package creational_patterns.factory_method.factory;

import creational_patterns.factory_method.MetodoPago;
import creational_patterns.factory_method.Transfer;

/**
 * Factory for creating credit card payment instances.
 * Specializes in instantiating credit card payment processors.
 */
public class TransferFactory extends MetodoPagoFactory {

    @Override
    public MetodoPago createMethodPay() {
       return  new Transfer();
    }
}
