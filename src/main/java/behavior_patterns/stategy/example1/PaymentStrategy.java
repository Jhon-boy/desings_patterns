package behavior_patterns.stategy.example1;

import java.math.BigDecimal;

/**
 * Define common method*/
public interface PaymentStrategy {

    void pay(BigDecimal amount);

}
