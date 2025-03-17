package coffee;

public class cappucino implements coffee{
    @Override
    public double getCost() {
        return 1.7;
    }

    @Override
    public String getDescription() {
        return "cappuccino";
    }
}
