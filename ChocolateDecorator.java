package coffee;

public class ChocolateDecorator extends CoffeeDecorator {
    public ChocolateDecorator(coffee coffee){
        super(coffee);
    }
    public double getCost(){
        return coffee.getCost() + 2.5;
    }
    public String getDescription(){
        return coffee.getDescription() + " with chocolate";
    }
}