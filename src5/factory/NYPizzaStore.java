package factory;

public class NYPizzaStore extends PizzaStore{
    Pizza createPizza(String type){
        Pizza pizza = null;

        if (type.equals("cheese"))
            pizza = new CheesePizza();
        else if (type.equals("greek"))
            pizza = new GreekPizza();
        else if (type.equals("pepperoni"))
            pizza = new PepperoniPizza();
        return pizza;
    }
}
