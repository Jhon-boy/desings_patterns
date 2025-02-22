package creational_patterns.prototype_example1;
// Prototype whit Patter Builder
public class Car implements Prototype{
    private String serial;
    private  String model;
    private String brand;
    private int year;

    private Car(String serial, String model, String brand, int year) {
        this.serial = serial;
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    public static class CarBuilder{
        private String serial;
        private  String model;
        private String brand;
        private int year;
        public  CarBuilder(String serial, String model ){
            this.serial = serial;
            this.model = model;
        }
        public CarBuilder setBrand(String brand){
            this.brand = brand;
            return this;
        }
        public CarBuilder setYear(int year){
            this.year = year;
            return this;
        }
        //Build de Builder
        public Car build() {
            return new Car(serial, model, brand, year);
        }
    }

    @Override //Clone method
    public Prototype clone() {
        return new Car(this.serial, this.model, this.brand, this.year);
    }
    public void printData(){
        System.out.println("model:" + model + " brand:" +brand + " year" + year);
    }
}
