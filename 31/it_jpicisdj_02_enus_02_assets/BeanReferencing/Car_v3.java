public class Car {

    String type;
    String model;
    double price;
    int combinedFuelEconomy;
    Engine engine;
    StandardSpecs specs;

    public Car(String type, String model, double price, int combinedFuelEconomy, Engine engine, StandardSpecs specs) {
        this.type = type;
        this.model = model;
        this.price = price;
        this.combinedFuelEconomy = combinedFuelEconomy;
        this.engine = engine;
        this.specs = specs;
    }


    @Override
    public String toString() {
        return "Car Type = " + type +
                ", Model = " + model +
                ",\nPrice = " + price +
                ",\nCombinedFuelEconomy(City & Highway) = " + combinedFuelEconomy + "mpg" +
                ",\n" + engine + ",\n" + specs;
    }
}