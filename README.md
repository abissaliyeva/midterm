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
- **Concrete Decorator Classes:** `MilkDecorator`, `CaramelDecorator`, `ChocolateDecorator` modify `getCost()` and `getDescription()`.

---

## Features
- Users can choose from four coffee types: Espresso, Cappuccino, Latte, and Americano.
- Users can dynamically add toppings: Milk, Caramel, Whipped Cream, and Chocolate.
- The system calculates the final cost based on the selected coffee and toppings.
- The order summary displays the final customized coffee with a detailed description.

---
   
## Conclusion
This project demonstrates the **Factory Method Pattern** for coffee creation and the **Decorator Pattern** for dynamically adding toppings. It provides a flexible and scalable design while ensuring easy maintenance and future enhancements.



# Payment Platform

## Overview
This is a console-based Payment Platform that supports multiple payment methods, including Credit Card, PayPal, and Cryptocurrency. The system uses the **Factory Method Pattern** for creating different payment objects and the **Adapter Pattern** to integrate an external or mock API for processing payments.

---

## Design Patterns Used

### 1. Factory Method Pattern
The Factory Method pattern is used to encapsulate the creation of different payment method objects. Instead of directly instantiating payment objects, we delegate object creation to a factory.

- **`PaymentMethod` Interface:** Defines `processPayment(double amount)`.
- **Concrete Payment Classes:** `CreditCardPayment`, `PayPalPayment`, `CryptoPayment` implement `PaymentMethod`.
- **Factory Class:** `PaymentFactory` contains `createPayment(String type)` to instantiate the correct payment method.

### 2. Adapter Pattern
The Adapter Pattern is used to integrate external or legacy APIs while ensuring compatibility with the `PaymentMethod` interface.

- **`ExternalPaymentAdapter` Interface:** Ensures that different adapters conform to a common structure.
- **`PayPalPaymentAdapter` Class:** Adapts an external/mock PayPal API.

---

## Features
- Users can choose a payment method: Credit Card, PayPal, or Cryptocurrency.
- The system processes payments and returns success or failure messages.
- Uses external adapters for integrating mock payment validation services.
- Includes basic error handling for invalid inputs and insufficient funds.
- Supports transaction logging and history tracking.

---

Conclusion

This project demonstrates the Factory Method Pattern for payment creation and the Adapter Pattern for external API integration. It provides a scalable design that supports multiple payment methods and allows for easy future enhancements.
