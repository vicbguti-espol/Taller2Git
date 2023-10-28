import java.util.ArrayList;
import java.util.List;

public class BurgerPojo {
    private String additonName;
    private double burgerAddtionalPrice;

    public void setAdiitonalItemNdPrice(String additonName,double burgerAddtionalPrice) {
        this.additonName =additonName;
        this.burgerAddtionalPrice = burgerAddtionalPrice;
    }

    public String getAdditonName() {
        return additonName;
    }

    public double getBurgerAddtionalPrice() {
        return burgerAddtionalPrice;
    }
}
