package DecoratorPattern;

public class PizzaShop {

    public static void main(String[] args) {
        //Ordering a plain pizza
        Pizza pizza = new PlainPizza();
        System.out.println(pizza.getDescription() + " Cost: $" + pizza.getCost());

        //Ordering a pizza with cheese
        Pizza cheesePizza = new Cheese(pizza);
        System.out.println(cheesePizza.getDescription() + " Cost: $" + cheesePizza.getCost());

        //Ordering a pizza with cheese and mushroom
        Pizza cheeseAndPepperoniPizza = new Pepperoni(new Cheese(pizza));
        System.out.println(cheeseAndPepperoniPizza.getDescription() + " Cost: $" + cheeseAndPepperoniPizza.getCost());
    }
    
}
