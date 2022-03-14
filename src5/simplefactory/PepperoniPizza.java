package simplefactory;

class PepperoniPizza extends Pizza{
    public void prepare(){
        System.out.println("Preparing pepperoni pizza");
    }

    public void bake(){
        System.out.println("Baking pepperoni pizza");
    }

    public void cut(){
        System.out.println("Cutting pepperoni pizza");
    }

    public void box(){
        System.out.println("Boxing pepperoni pizza");
    }
}