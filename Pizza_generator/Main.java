package Pizza_generator;

public class Main {
    public static void main(String[] args){
        // Pizza basePizza = new Pizza(true);
        // basePizza.addExtraToppings();
        // basePizza.addExtraCheese();
        // basePizza.takeAway();
        // basePizza.getBill();

        Deluxpizza dp = new Deluxpizza(true);
        dp.takeAway();
        dp.getBill();
    }

}