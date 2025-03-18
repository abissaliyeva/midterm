# Coffee Ordering System

## Overview
This is a console-based Coffee Ordering System that utilizes the **Factory Method Pattern** for coffee creation and the **Decorator Pattern** for adding toppings dynamically. Users can select a coffee type and customize it with additional ingredients, and the system calculates the final cost and provides a description of the customized coffee.

---

## Design Patterns Used

### 1. Factory Method Pattern
The Factory Method pattern is used to encapsulate the creation of different coffee types. Instead of directly instantiating coffee objects, we delegate the object creation to a factory.

- **`Coffee` Interface:** Defines `getCost()` and `getDescription()` methods.
- **Concrete Coffee Classes:** `Espresso`, `Cappuccino`, `Latte`, `Americano` implement the `Coffee` interface.
- **Factory Class:** `CoffeeFactory` contains the method `createCoffee(String type)` to instantiate the correct coffee type based on user input.

### 2. Decorator Pattern
The Decorator Pattern is used to dynamically add extra ingredients or toppings to a base coffee without modifying the existing coffee classes.

- **`CoffeeDecorator` Abstract Class:** Implements `Coffee` and wraps an existing coffee object.
- **Concrete Decorator Classes:** `MilkDecorator`, `CaramelDecorator`, `WhippedCreamDecorator`, `ChocolateDecorator` modify `getCost()` and `getDescription()`.

---

## Features
- Users can choose from four coffee types: Espresso, Cappuccino, Latte, and Americano.
- Users can dynamically add toppings: Milk, Caramel, Whipped Cream, and Chocolate.
- The system calculates the final cost based on the selected coffee and toppings.
- The order summary displays the final customized coffee with a detailed description.

---

## Installation & Running the Program
### Prerequisites
- Java Development Kit (JDK) installed (Java 8 or later).
- A Java-compatible IDE (e.g., IntelliJ IDEA, Eclipse, VS Code) or a terminal.

### Steps to Run
1. **Compile the Java files:**
   ```sh
   javac CoffeeOrderDemo.java
   ```
2. **Run the program:**
   ```sh
   java CoffeeOrderDemo
   ```
3. **Follow the console instructions** to select a coffee and add toppings.

---

## Conclusion
This project demonstrates the **Factory Method Pattern** for coffee creation and the **Decorator Pattern** for dynamically adding toppings. It provides a flexible and scalable design while ensuring easy maintenance and future enhancements.

