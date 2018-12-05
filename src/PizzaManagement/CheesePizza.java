package PizzaManagement;

public class CheesePizza implements iPizza{
    @Override
    public void MakePizza() {
        System.out.println("Adding tomato sauce and cheese");
        System.out.println("Firing the oven");
        System.out.println();
        System.out.println("Cheese pizza is ready!");

    }
}
