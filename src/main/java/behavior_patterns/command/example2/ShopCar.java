package behavior_patterns.command.example2;

import java.util.ArrayList;
import java.util.List;

public class ShopCar {

    private List<Product> products = new ArrayList<>();

    public  void addProduct(Product product){
        products.add(product);
        System.out.println("Added product " + product);
    }
    public  void removeProduct(Product product){
        products.remove(product);
        System.out.println("Removed product " + product);
    }

    public void showProducts(){
        products.stream().forEach(product ->
                System.out.println("Product: " + product.getName() +
                        "  Price" + product.getPrice()));
    }

}
