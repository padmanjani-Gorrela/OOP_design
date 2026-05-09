package Pizza_generator;

public class Pizza {
    private int price;
    private boolean veg;

    private int extraCheesePrice = 100;
    private int extraToppingsAdded = 150;
    private int backPack = 20;

    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;


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
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }

    public void addExtraToppings(){
        isExtraToppingsAdded = true;
        this.price += extraToppingsAdded;
    }

    public void takeAway(){
        isOptedForTakeAway = true;
        this.price += backPack;
    }

    public void getBill(){
        String bill = "";
        System.out.println("Pizza:" + basePizzaPrice);
        if(isExtraCheeseAdded){
            bill += "Extra cheese added" + extraCheesePrice + "\n";
        }
        if(isExtraToppingsAdded){
            bill += "Extra Toopings added" + extraToppingsAdded + "\n";
        }
        if(isOptedForTakeAway){
            bill += "Take Away" + backPack+ "\n";
        }
        bill += "bill: " + this.price + "\n";
        System.out.println(bill);
    }
    
}