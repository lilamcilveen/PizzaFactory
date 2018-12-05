package PizzaManagement;

public class PizzaFactory {
    public static iPizza GetPizza(String pizzaType) throws Exception{
        switch(pizzaType) {

            case "cheese":
                return new CheesePizza();
            case "hawaiian":
                return new HawaiianPizza();
            case "combination":
                return new CombinationPizza();
            default:
                throw new Exception("Invalid pizza type");
        }
    }
}
