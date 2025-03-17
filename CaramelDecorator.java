package coffee;

public class CaramelDecorator extends CoffeeDecorator {
    public CaramelDecorator(coffee coffee){
        super(coffee);
    }
    public double getCost(){
        return coffee.getCost() + 0.25;
    }
    public String getDescription(){
        return coffee.getDescription() + " with caramel";
    }
}