package creational_patterns.factory_method.factory;

import creational_patterns.factory_method.MetodoPago;


/**
 * Abstract factory for creating payment method instances.
 * Defines the base contract for concrete payment method factories.
 */
public  abstract class MetodoPagoFactory {

    public  abstract MetodoPago createMethodPay();

}
