package coffee;

public class Latte implements coffee{
    @Override
    public double getCost() {
        return 2;
    }

    @Override
    public String getDescription() {
        return "latte";
    }
}
