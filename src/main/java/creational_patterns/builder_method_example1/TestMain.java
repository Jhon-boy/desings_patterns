package creational_patterns.builder_method_example1;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class TestMain {

    public static void main(String [] args) {
        UserExample userExample = new UserExample.UserBuilder("Jhony", "0606253168")
                .setAddress("EC +593 - RIOBAMBA").setEmail("jhony@example.com").build();
        userExample.showData();

      Invoice invoiceExample = new Invoice.InvoiceBuilder("848FFS", "NAME1 NAME2 LASTNAME1",
                List.of( Map.of("LaptopAsus", new BigDecimal("80"))))
                .setDiscount(new BigDecimal("10"))
                .setTax(new BigDecimal("0")).build();
        System.out.println(invoiceExample);

    }
}
