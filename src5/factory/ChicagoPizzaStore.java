package factory;

public class ChicagoPizzaStore extends PizzaStore{
    Pizza createPizza(String type){
        Pizza pizza = null;

        if (type.equals("cheese"))
            pizza = new CheesePizza();
        else if (type.equals("greek"))
            pizza = new GreekPizza();
        else if (type.equals("veggie"))
            pizza = new VeggiePizza();
        return pizza;
    }
}
