package Pizza_generator;

public class Pizza {
    private int price;
    private boolean veg;

    private int extraCheesePrice = 100;
    private int extraToppingsAdded = 150;
    private int backPack = 20;

    public Pizza(Boolean veg){
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        }
        else{
            this.price = 400;
        }
    }

    public void addExtraCheese(){
        System.out.println("Extra cheese added");
        this.price += extraCheesePrice;
    }

    public void addExtraToppings(){
        System.out.println("Extra toppings Added");
        this.price += extraToppingsAdded;
    }

    public void takeAway(){
        System.out.println("Take Away opted");
        this.price += backPack;
    }

    public void getBill(){
        System.out.println(this.price);
    }

    
}