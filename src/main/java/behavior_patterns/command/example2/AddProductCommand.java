package behavior_patterns.command.example2;

public class AddProductCommand implements  Command {

    public  ShopCar shopCar;
    public  Product product;

    public AddProductCommand(ShopCar shopCar, Product product){
        this.shopCar = shopCar;
        this.product = product;
    }


    @Override
    public void execute() {
    shopCar.addProduct(product);
    }

    @Override
    public void undo() {
    shopCar.removeProduct(product);
    }
}
