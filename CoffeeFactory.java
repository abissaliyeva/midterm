package coffee;

public class CoffeeFactory {
    public static coffee createCoffee(String type) {
        if (type.equalsIgnoreCase("espresso")) {
            return new espresso();
        } else if (type.equalsIgnoreCase("cappuccino")) {
            return new cappucino();
        } else if (type.equalsIgnoreCase("latte")) {
            return new Latte();
        } else if (type.equalsIgnoreCase("americano")) {
            return new Americano();
        } else {
            throw new IllegalArgumentException("there's not such kind of coffee: " + type);
        }
    }
}