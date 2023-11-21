import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

    String type;
    String model;
    double price;
    int combinedFuelEconomy;

    @Autowired
    @Qualifier("newEngine")
    Engine engine;

    @Autowired(required=false)
    StandardSpecs specs;

    # ...
    # Same Getters and Setters for all our fields as before
    # ...

    @Override
    public String toString() {
        return "Car Type = " + type +
                ", Model = " + model +
                ",\nPrice = " + price +
                ",\nCombinedFuelEconomy(City & Highway) = " + combinedFuelEconomy + "mpg" +
                ",\n" + engine + ",\n" + specs;
    }
}