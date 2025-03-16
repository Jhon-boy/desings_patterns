package behavior_patterns.iterator.example1;

import java.util.List;

// let traverse list of products
public class ProductIterator implements MyIterator<Product> {

    private List<Product> products;
    private int position = 0;

    public ProductIterator(List<Product> products) {
        this.products = products;
    }


    @Override
    public boolean hasNext() {
        return  position < products.size();
    }

    @Override
    public Product next() {
        if(!hasNext()){
            throw new IllegalStateException("There are not elements");
        }
      return products.get(position++);
    }
}
