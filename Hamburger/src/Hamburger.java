
import java.util.ArrayList;
import java.util.List;

public class Hamburger {

    public static void main(String[] args) {

        System.out.println("\n              Welcome to Bills Burgers\n" +
                "                  ******************\n");

        System.out.println("                Base Burger Details    \n" +
                "            **************************");

        BurgerDetails baseBurger = new BurgerDetails("Ciabatta Roll", "chicken", 50.2, "Grilled Burger");
        BurgerPojo burgerPojo = new BurgerPojo(), burgerPojo1 = new BurgerPojo(), burgerPojo2 = new BurgerPojo(), burgerPojo3 = new BurgerPojo();
        burgerPojo.setAdiitonalItemNdPrice("lettuce", 15.6);
        burgerPojo1.setAdiitonalItemNdPrice("cauliflower", 10.3);
        burgerPojo2.setAdiitonalItemNdPrice("cabbage", 33);
        burgerPojo3.setAdiitonalItemNdPrice("tomato", 22);
        List<BurgerPojo> baseHamburgerPojoList = new ArrayList<>();
        baseHamburgerPojoList.add(burgerPojo);
        baseHamburgerPojoList.add(burgerPojo1);
        baseHamburgerPojoList.add(burgerPojo2);
        baseHamburgerPojoList.add(burgerPojo3);
        baseBurger.add_AdditionalItem(baseHamburgerPojoList);


        System.out.println(" \n\n               Healthy Burger Details    \n" +
                "            **************************\n\n");
        HealthyBurger healthyBurger = new HealthyBurger();
        healthyBurger.add_AdditionalItem();


        System.out.println("  \n\n              Delux Burger Details    \n" +
                "            ************************** \n\n");
        new DeluxHamburger();


    }

}