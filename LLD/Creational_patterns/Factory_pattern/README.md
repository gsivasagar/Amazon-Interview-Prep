# Factory Design Pattern

## 1. Why use the Factory Pattern?
In many applications, the process of creating an object (using the `new` keyword) can be complex. If you scatter object creation logic throughout your business logic, the code becomes tightly coupled and hard to maintain.

**The Goal**: Delineate "what" needs to be created from "how" it is created.

**The Solution**: A specialized "Factory" class takes the responsibility of instantiating the correct subclass based on specific inputs.

## 2. Levels of Factory Design Patterns

### A. Simple Factory
**Concept**: A single class with a method that returns different subclasses based on an input (like a String type).

**Example**: A `BurgerFactory` that takes a type ("Basic", "Standard", "Premium") and returns the corresponding `Burger` object.

### B. Factory Method Pattern
**Concept**: Defines an interface for creating an object but lets subclasses decide which class to instantiate.

**Example**: Different burger franchises (e.g., `KingBurger` vs. `SingBurger`) might produce different variations (Wheat-based vs. Normal) of the same burger types. Each franchise implements its own `createBurger()` method.

### C. Abstract Factory Pattern
**Concept**: Provides an interface for creating families of related objects without specifying their concrete classes.

**Example**: A `MealFactory` that creates both a `Burger` and a `GarlicBread`. A `WheatMealFactory` would produce a `WheatBurger` and `WheatGarlicBread`, ensuring the entire "family" of products is consistent.
