public abstract class Vehicle {

    String make
    String model
    String colour
    int topSpeed
    int price

    public Vehicle(String make, String model, String colour, int topSpeed, int price) {
        this.make = make
        this.model = model
        this.colour = colour
        this.topSpeed = topSpeed
        this.price = price
    }
}

/*
I know basic use of abstract classes is to create templates for future classes. But are there any more uses of them?

Not only can you define a template for children, but Abstract Classes offer the added benefit of letting you define functionality that your child classes can utilize later.

You could not provide a default method implementation in an Interface prior to Java 8.

When should you prefer them over interfaces and when not?

Abstract Classes are a good fit if you want to provide implementation details to your children but don't want to allow an instance of your class to be directly instantiated (which allows you to partially define a class).

If you want to simply define a contract for Objects to follow, then use an Interface.

Also when are abstract methods useful?

Abstract methods are useful in the same way that defining methods in an Interface is useful. It's a way for the designer of the Abstract class to say "any child of mine MUST implement this method".
 */

