package coffee;

public class espresso implements coffee{
    @Override
    public double getCost() {
        return 1;
    }

    @Override
    public String getDescription() {
        return "espresso";
    }
}
