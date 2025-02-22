package creational_patterns.factory_method.factory;

import creational_patterns.factory_method.CardCredit;
import creational_patterns.factory_method.MetodoPago;

/**
 * Factory for creating credit card payment instances.
 * Specializes in instantiating credit card payment processors.
 */
public class CardCreditFactory extends  MetodoPagoFactory {


    @Override
    public MetodoPago createMethodPay() {
        return  new CardCredit();
    }
}
