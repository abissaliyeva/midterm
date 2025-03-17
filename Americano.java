package coffee;

public class Americano implements coffee{
    @Override
    public double getCost() {
        return 1.5;
    }

    @Override
    public String getDescription() {
        return "americano";
    }
}
