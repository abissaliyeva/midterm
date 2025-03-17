package coffee;

public abstract class CoffeeDecorator implements coffee {
    public coffee coffee;
    public CoffeeDecorator(coffee coffee){
        this.coffee = coffee;
    }
    public double getCost(){
        return coffee.getCost();
    }
    public String getDescription(){
        return coffee.getDescription();
    }
}