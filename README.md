### SimpleFactoryDesignPattern
Pizza builder, covering the intuition behind the factory design pattern.

The idea behind factory design pattern:
 - the factory (PizzaFactory) creates concrete objects and returns it to a client class (PizzaOrderTool)
 - the client class treats contrete objects (e.g. CheesePizza) as base class objects
 - the client class does not need to know the type of concrete object (due to polymorphism)
 
How to run:
 - Input the type of pizza you want to order.
 - "cheese", "hawaiian", "combination"

Example:

    Which kind of pizza do you want?
    hawaiian
    
    Adding tomato sauce and cheese
    Adding pineapple, back bacon, and ham.
    Firing the oven.

    Hawaiian pizza is ready!

    Process finished with exit code 0

Created on December 5, 2018.
