package Pizza_generator;
public class Deluxpizza extends Pizza{
    public Deluxpizza(Boolean veg){
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    public void addExtraCheese(){}

    @Override
    public void addExtraToppings(){}
}