public class HealthyBurger extends BurgerDetails {

    HealthyBurger() {
        super("brown rye bread roll", "Tuna", 44.7, "Tangy tuna burgers");
    }



    public void add_AdditionalItem() {
        BurgerPojo burgerPojo = new BurgerPojo(), burgerPojo1 = new BurgerPojo();
        burgerPojo.setAdiitonalItemNdPrice("onions", 30);
        burgerPojo1.setAdiitonalItemNdPrice("broccoli", 49);
        items.add(burgerPojo);
        items.add(burgerPojo1);
        super.getAllAdditonalDetails();
    }

    @Override
    public void getAllAdditonalDetails() {
        super.getAllAdditonalDetails();
    }
}