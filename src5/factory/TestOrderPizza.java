package factory;

public class TestOrderPizza {
    public static void main(String[] args) {
        PizzaStore nyps = new NYPizzaStore();
        PizzaStore cgps = new ChicagoPizzaStore();

        Pizza pizza = nyps.orderPizza("cheese");
        System.out.println("The first pizza....\n");

        pizza = cgps.orderPizza("veggie");
        System.out.println("The second pizza....");
    }
}
