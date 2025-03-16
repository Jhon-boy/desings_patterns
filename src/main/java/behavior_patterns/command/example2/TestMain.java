package behavior_patterns.command.example2;

public class TestMain {

    public static void main(String[] args) {

        ShopCar car = new ShopCar();
        CarInvoker invoker = new CarInvoker();

        Product product1 = new Product("Pupos", 78.0);
        Product product2 = new Product("T-Shirt", 50.0);

        Command addProduct1 = new AddProductCommand(car, product1);
        Command addProduct2 = new AddProductCommand(car, product2);

        invoker.executeCommand(addProduct1);
        invoker.executeCommand(addProduct2);
        car.showProducts();

        //Remove last product
        invoker.undoLastCommand();
        car.showProducts();

    }
}
