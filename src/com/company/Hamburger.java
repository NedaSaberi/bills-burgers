package com.company;

public class Hamburger {
    private String name;
    private String meet;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meet, double price, String breadRollType) {
        this.name = name;
        this.meet = meet;
        this.price = price;
        this.breadRollType = breadRollType;
    }
    public void addHamburgerAddition1 (String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
    }
    public void addHamburgerAddition2 (String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }
    public void addHamburgerAddition3 (String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }
    public void addHamburgerAddition4 (String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
    }
    public double itemizehamburger(){
        System.out.println(this.name+ " hamburger on a " + this.breadRollType + " roll with "+ this.meet+ ", Price is "+ price);
        double totalPrice = this.price;

        if (this.addition1Name != null){
            System.out.println("added "+ addition1Name + " for an extra "+ this.addition1Price);
            totalPrice += this.addition1Price;
        }
        if (this.addition2Name != null){
            System.out.println("added "+ addition2Name + " for an extra "+ this.addition2Price);
            totalPrice += this.addition2Price;
        }
        if (this.addition3Name != null){
            System.out.println("added "+ addition3Name + " for an extra "+ this.addition3Price);
            totalPrice += this.addition3Price;
        }
        if (this.addition4Name != null){
            System.out.println("added "+ addition4Name + " for an extra "+ this.addition4Price);
            totalPrice += this.addition4Price;
        }
//        System.out.println(" --> TOTAL PRICE : "+ totalPrice);
        return totalPrice;
    }
}
