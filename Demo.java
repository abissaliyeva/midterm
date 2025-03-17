package coffee;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Choose your coffee: ");
        String coffeeType = in.nextLine();

        coffee coffee = CoffeeFactory.createCoffee(coffeeType);

        boolean ordering = true;
        while (ordering) {
            System.out.println("Choose toppings:");
            String topping = in.nextLine();

            if (topping.equals("milk")) {
                coffee = new MilkDecorator(coffee);
            } else if (topping.equals("caramel")) {
                coffee = new CaramelDecorator(coffee);
            } else if (topping.equals("chocolate")) {
                coffee = new ChocolateDecorator(coffee);
            } else if (topping.equals("-")) {
                ordering = false;
            } else {
                System.out.println("Invalid choice, try again.");
            }
        }

        System.out.println("Your Order: " + coffee.getDescription());
        System.out.println("Total Cost: $" + coffee.getCost());
    }
}
