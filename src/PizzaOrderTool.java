import PizzaManagement.iPizza;
import PizzaManagement.PizzaFactory;

import java.util.Scanner;

public class PizzaOrderTool  {
    public static void main(String[] args) throws Exception {
        /*
         * What type of pizza does the user want to order?
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Which kind of pizza do you want?");
        String pizzaResult = input.nextLine();
        
        System.out.println();

        iPizza pizza = PizzaFactory.GetPizza(pizzaResult);
        pizza.MakePizza();
    }
}
