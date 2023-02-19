package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;



    public Pizza(Boolean isVeg){

        this.isVeg = isVeg;
        if(isVeg){
            this.price=300;
        }else{
            this.price=400;
        }
        this.bill="Base Price Of The Pizza: "+price+ "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        this.price+=80;
        this.bill+="Extra Cheese Added: 80 \n";
    }

    public void addExtraToppings(){
        int toppingPrice=0;
        // your code goes here
        if(this.isVeg){
            toppingPrice =70;
        }else{
            toppingPrice=120;
        }
        this.price+=toppingPrice;
        this.bill+="Extra Toppings Added: "+toppingPrice+ "\n";

    }

    public void addTakeaway(){
        // your code goes here
        this.price+=20;
        this.bill+="Paperbag Added: 20 \n";
    }

    public String getBill(){
        this.bill+="Total Price: "+this.price;
        return this.bill;
    }
}
