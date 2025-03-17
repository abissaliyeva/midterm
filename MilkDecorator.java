package coffee;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 1;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " with milk";
    }
}