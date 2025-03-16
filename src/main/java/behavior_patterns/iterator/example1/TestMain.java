package behavior_patterns.iterator.example1;

public class TestMain {

    public static void main(String[] args) {

        CatalogProducts products = new CatalogProducts();
        products.addProduct(new Product("T-shirt", 45.2));
        products.addProduct(new Product("Shoes", 102));
        MyIterator<Product> iterator = products.getIterable(50);
        System.out.println("Products on catalogs");

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
