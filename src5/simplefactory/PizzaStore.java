package simplefactory;

public class PizzaStore {
//    SimplePizzaFactory simplefactory;
//
//    public PizzaStore(SimplePizzaFactory simplefactory){
//        this.simplefactory = simplefactory;
//    }

    //简单工厂模式，PizzaStore指向了简单工厂
//    public static Pizza orderPizza(String type){
//        Pizza pizza;
//
//        pizza = SimplePizzaFactory.createPizza(type);
//
//        pizza.prepare();
//        pizza.bake();
//        pizza.cut();
//        pizza.box();
//
//        return pizza;
//    }

    // 原始的pizzastore设计
    public static Pizza orderPizza(String type){
        Pizza pizza;

        if (type.equals("cheese"))
            pizza = new CheesePizza();
        else if (type.equals("greek"))
            pizza = new GreekPizza();
        else if (type.equals("pepperoni"))
            pizza = new PepperoniPizza();
        else
            pizza = null;

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }


    public static void main(String[] args){
        PizzaStore.orderPizza("greek");
    }
}