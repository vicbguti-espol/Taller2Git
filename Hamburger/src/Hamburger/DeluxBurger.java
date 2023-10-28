package Hamburger;

public class DeluxBurger extends BaseBurger{
    DeluxBurger(){
        super("DeluxBurger","Huge Roll","Chicken",12);
    }
    public void addAdditions() {
        System.out.println("Additional additions you added: ");
            additions.add(1);
            System.out.println("Chips");
            additions.add(2);
            System.out.println("Drinks");

    }

    @Override
    public String calculatePrice() {
        return super.calculatePrice();
    }

    @Override
    public void additionalPrice() {
        super.additionalPrice();
    }

    @Override
    public double getBase_price() {
        return super.getBase_price();
    }


}