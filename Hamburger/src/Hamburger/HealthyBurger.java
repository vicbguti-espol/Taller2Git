package Hamburger;

public class HealthyBurger extends BaseBurger {
    HealthyBurger() {
        super("Health Burger", "Brown rye bread roll", "Chicken", 35);
    }

    public void addAdditions() {
        super.addAdditions(1, 2, 3, 4);
        additions.add(5);
        System.out.println("Mustard");
        additions.add(6);
        System.out.println("Ketchup");

    }

    @Override
    public void additionalPrice() {
        super.additionalPrice();
    }

    @Override
    public double getBase_price() {
        return super.getBase_price();
    }

    @Override
    public String calculatePrice() {
        return super.calculatePrice();
    }


}