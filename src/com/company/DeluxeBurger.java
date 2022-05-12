package com.company;

public class DeluxeBurger extends Hamburger{
    private final String deluxeExtra1Name = "Chips";
    private final double deluxeExtra1Price = 2.75;

    private final String deluxeExtra2Name = "Drink";
    private final double deluxeExtra2Price = 1.81;

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 2.81);
        }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

//    @Override
//    public double itemizehamburger() {
//        return 19.10;
//    }
}
