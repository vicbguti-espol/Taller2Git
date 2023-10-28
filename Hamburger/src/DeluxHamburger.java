
import java.util.ArrayList;
import java.util.List;

public class DeluxHamburger extends BurgerDetails {

    DeluxHamburger() {
        super("Normal roll", "Turkey", 77,"Elk Burger");
        BurgerPojo burgerPojo = new BurgerPojo(), burgerPojo1 = new BurgerPojo();
        burgerPojo.setAdiitonalItemNdPrice("potato chips",30);
        burgerPojo1.setAdiitonalItemNdPrice("cola",49);
        items1.add(burgerPojo);
        items1.add(burgerPojo1);
        super.getAllAdditonalDetailsDelux();
    }

    @Override
    public void getAllAdditonalDetails() {
        super.getAllAdditonalDetails();
    }
}