package behavior_patterns.iterator.example1;

import java.util.List;
import java.util.stream.Collectors;

public class ProductoIteratorFiltrado implements  MyIterator<Product>  {

    private double initialPrice;
    private List<Product> products;
    private int posicion =0;

    public ProductoIteratorFiltrado(double initialPrice, List<Product> products) {
        this.initialPrice = initialPrice;
        this.products = products.stream().filter(p -> p.getPrice()> initialPrice).collect(Collectors.toList());
    }


    @Override
    public boolean hasNext() {
        return posicion < products.size();
    }

    @Override
    public Product next() {
        if(!hasNext()){
            throw new IllegalStateException("No hay más productos");
        }
            return products.get(posicion++);
       // return  products.stream().filter(p -> p.getPrice() > initialPrice).collect(Collectors.toList()).get(posicion++);
    }
}
