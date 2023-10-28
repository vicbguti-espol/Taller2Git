
import java.util.ArrayList;
import java.util.List;

public class BurgerDetails {

    private final double basePrice;
    private double totalAdditonalPrice;
    public static List<BurgerPojo> items = new ArrayList<>();
    public List<BurgerPojo> items1 = new ArrayList<>();


    BurgerDetails(String rollType, String mMeat, double basePrice, String burgerName) {
        this.basePrice = basePrice;
        System.out.println("Burger Name : " + burgerName + "\nBread roll type : " + rollType + "\nMeat :" + mMeat + " \n" +
                "Base Price : " + basePrice);}

   public void getAllAdditonalDetails(){
      System.out.print("Number of Additional item added are : " + items.size()+"\n");
       for (BurgerPojo item : items) {
           System.out.println("Additional item Added is : " + item.getAdditonName() + " [Add on Price is : " + item.getBurgerAddtionalPrice() + "]");
           totalAdditonalPrice += item.getBurgerAddtionalPrice();
       }
      System.out.print("\nTotal Additional Price is: " + totalAdditonalPrice+"\n");
      System.out.print("Grand Total : " + String.format("%.2f",(totalAdditonalPrice + basePrice)) + "\n");
  }

    public void getAllAdditonalDetailsDelux(){
        System.out.print("Number of Additional item added are : " + items1.size()+"\n");
        for (BurgerPojo item : items1) {
            System.out.println("Additional item Added is : " + item.getAdditonName() + " [Add on Price is : " + item.getBurgerAddtionalPrice() + "]");
            totalAdditonalPrice += item.getBurgerAddtionalPrice();
        }
        System.out.print("\nTotal Additional Price is: " + totalAdditonalPrice+"\n");
        System.out.print("Grand Total : " + String.format("%.2f",(totalAdditonalPrice + basePrice)) + "\n");
    }

    public void add_AdditionalItem(List<BurgerPojo> items) {
        BurgerDetails.items =items;
        System.out.print("Number of Additional item added are: " + items.size()+"\n");
        for (int i = 0 ; i < 4; i ++) {
            System.out.println("Additional item Added is: " + items.get(i).getAdditonName() + " [Add on Price is : " + items.get(i).getBurgerAddtionalPrice() + "]");
            totalAdditonalPrice += items.get(i).getBurgerAddtionalPrice();
        }
        System.out.print("\nTotal Additional Price is: " + totalAdditonalPrice+"\n");
        System.out.print("Grand Total : " +String.format("%.2f",(totalAdditonalPrice + basePrice)) + "\n");

    }
}