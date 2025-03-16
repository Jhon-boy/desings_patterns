package behavior_patterns.iterator.example1;

import java.util.ArrayList;
import java.util.List;

public class CatalogProducts implements  MyIterable<Product>{

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }
    @Override
    public MyIterator<Product> getIterable(double price) {
        //return new ProductIterator(products);
        return new ProductoIteratorFiltrado(price, products);
    }

}
