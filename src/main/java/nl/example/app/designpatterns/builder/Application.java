package nl.example.app.designpatterns.builder;


/**
 * This class demonstrates the usage of the Builder pattern
 */
public class Application {

    public static void main(String[] args) {
        // longer version
        {
            Car.CarBuilder builder = new Car.CarBuilder("Mercedes");
            builder.licensePlate("AABBCC");
            builder.cc(3500);

            Car car = builder.build();

            System.out.println(car);

            // print the hashCode to see the address of the Car instance
            // to show that the objects are different instances
            System.out.println("hashCode / address => "+car.hashCode());

            car = builder.build();

            System.out.println(car);

            // print the hashCode to see the address of the Car instance
            // to show that the objects are different instances
            System.out.println("hashCode / address => "+car.hashCode());
        }

        // shorter version
        {
            Car car = new Car.CarBuilder("Mercedes").licensePlate("AABBCC").cc(3500).build();
            System.out.println(car);
            // print the hashCode to see the address of the Car instance
            System.out.println("hashCode / address => "+car.hashCode());
        }
    }
}