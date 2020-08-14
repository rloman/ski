package nl.example.app.designpatterns.builder;

/**
 * This is the desired object, an instance of the Car class
 */
public class Car {

    private String brand;
    private String licensePlate;
    private Engine engine;

    private Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.licensePlate = builder.licensePlate;
        this.engine = new Engine(builder.cc);
    }

    public String getBrand() {
        return brand;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + getBrand() + '\'' +
                ", licensePlate='" + getLicensePlate() + '\'' +
                ", engine=" + getEngine() +
                '}';
    }

    /**
     * This is the inner class CarBuilder in the Car class
     */
    public static class CarBuilder {


        private String brand;
        private String licensePlate;
        private int cc;

        public CarBuilder(String brand) {
            this.brand = brand;
        }

        public CarBuilder licensePlate(String licensePlate) {
            this.licensePlate = licensePlate;

            return this;
        }

        public CarBuilder cc(int cc) {
            this.cc = cc;

            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
