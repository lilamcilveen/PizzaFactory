package PizzaManagement;

public class HawaiianPizza implements iPizza {
    @Override
    public void MakePizza() {
        System.out.println("Adding tomato sauce and cheese");
        System.out.println("Adding pineapple, back bacon, and ham.");
        System.out.println("Firing the oven.");
        System.out.println();
        System.out.println("Hawaiian pizza is ready!");

    }
}
