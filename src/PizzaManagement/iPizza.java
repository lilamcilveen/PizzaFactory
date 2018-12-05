package PizzaManagement;

public interface iPizza {
    // Gives all the ingredient for a specific pizza (polymorphism)
    //  - When we return an object type, we can return an iPizza
    //  - Don't have to specify if it's a Hawaiian pizza or Combination pizza
    public void MakePizza();
}
