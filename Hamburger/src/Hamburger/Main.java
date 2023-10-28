package Hamburger;

public class Main {
    public static void main(String[] args){
        System.out.println("Base Burger Details \n" +
                "*****************");

        BaseBurger baseBurger = new BaseBurger("Chicken burger", "White seasame bread","chicken",43);
        baseBurger.addAdditions(1,2,3,4);
        baseBurger.additionalPrice();
        System.out.println(baseBurger.calculatePrice());


        System.out.println("Healthy Burger Details \n" +
                "****************");

        HealthyBurger newBurger = new HealthyBurger();
        newBurger.addAdditions();
        newBurger.additionalPrice();
        System.out.println(newBurger.calculatePrice());

        System.out.println("Delux Burger Details \n" +
                "*************");

        DeluxBurger lastBurger = new DeluxBurger();
        lastBurger.addAdditions();
        lastBurger.additionalPrice();
        System.out.println(lastBurger.calculatePrice());

    }
}
