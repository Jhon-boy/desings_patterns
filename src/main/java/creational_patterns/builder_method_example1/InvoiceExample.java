package creational_patterns.builder_method_example1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Entity invoice
 * */
 class Invoice {
    private  String invoiceNumber;
    private String customerName;
    private List<Map<String, BigDecimal>> items;
    private BigDecimal discount;
    private BigDecimal tax;
    private BigDecimal totalAmount;

    private Invoice(InvoiceBuilder builder ){
        this.invoiceNumber = builder.invoiceNumber;
        this.customerName = builder.customerName;
        this.items = builder.items;
        this.discount = builder.discount;
        this.tax = builder.tax;
        List<BigDecimal> values = new ArrayList<>();
        for (Map<String, BigDecimal> data : builder.items)
            values.addAll(data.values());
        this.totalAmount = calculateTotalAmount(values);
    }
    // Calculate total Amount
    private BigDecimal calculateTotalAmount(List<BigDecimal> pricesByItems) {

        BigDecimal subtotal = pricesByItems.stream().reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal discountAmount = subtotal.multiply(discount)
                .divide(new BigDecimal("100"), 2);
        BigDecimal priceAfterDiscount = subtotal.subtract(discountAmount);

        BigDecimal taxAmount = priceAfterDiscount.multiply(tax)
                .divide(new BigDecimal("100"), 2);

        return priceAfterDiscount.add(taxAmount);
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceNumber='" + invoiceNumber + '\'' +
                ", customerName='" + customerName + '\'' +
                ", items=" + items +
                ", discount=" + discount +
                ", tax=" + tax +
                ", totalAmount=" + totalAmount +
                '}';
    }

    public static class InvoiceBuilder{
        private final String invoiceNumber;
        private final String customerName;
        private final  List< Map<String, BigDecimal>> items;
        private  BigDecimal discount;
        private  BigDecimal tax;
        private  BigDecimal totalAmount;

        public InvoiceBuilder(String invoiceNumber, String customerName, List<Map<String, BigDecimal>> item){
            this.invoiceNumber = invoiceNumber;
            this.customerName = customerName;
            this.items = item;
        }

        public InvoiceBuilder setDiscount(BigDecimal discount){
            this.discount = discount;
            return this;
        }

        public InvoiceBuilder setTax(BigDecimal tax){
            this.tax = tax;
            return this;
        }

        public Invoice build(){
            return new Invoice(this);
        }
    }
}
