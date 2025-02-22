package creational_patterns.prototype_example1;

public class TestMain {
    public static void main(String [] args)throws Exception {
        Car car_hyunday = new Car.CarBuilder("0545", "HYNDAY").setBrand("SONATA").setYear(2104).build();
        car_hyunday.printData();

        Car car_mazda = (Car) car_hyunday.clone();
        car_mazda.printData();
    }
}
