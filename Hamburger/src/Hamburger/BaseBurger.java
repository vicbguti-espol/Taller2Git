package Hamburger;

import java.util.ArrayList;
import java.util.List;

public class BaseBurger {
    private String name;
    private String breadRollType;
    private String meat;
    private double base_price;
    private double total_price;
<<<<<<< HEAD
    private String size; 

    BaseBurger(String name, String breadRollType,String meat,double basePrice, String size){
=======
    private double discount;
    
    BaseBurger(String name,
            String breadRollType, 
            String meat, 
            double basePrice){
>>>>>>> a1caf8d7d5f5da149de1475d1f40e686d3935c02
        this.name = name;
        this.breadRollType =  breadRollType;
        this.meat = meat;
        this.base_price = basePrice;
<<<<<<< HEAD
        this.size = "Normal";

    }

    public void setSize(String size) {
        this.size = size;
=======
        this.discount = 0;
>>>>>>> a1caf8d7d5f5da149de1475d1f40e686d3935c02
    }
    
    BaseBurger(String name,
            String breadRollType, 
            String meat, 
            double basePrice,
            double discount){
        this(name, breadRollType, meat, basePrice);
        this.discount = discount;
    }
    
    public List<Integer> additions = new ArrayList<>();
    private final double addedPrice = 23;

    public void addAdditions(int lettuce, int tomato, int carrot, int ham){
        System.out.println("Additional additions you added: ");
        if(lettuce == 1){
            additions.add(lettuce);
            System.out.println("Lettuce");
        }
        if(tomato == 2){
            additions.add(tomato);
            System.out.println("Tomato");
        }
        if(carrot == 3){
            additions.add(carrot);
            System.out.println("Carrot");
        }
        if(ham == 4){
            additions.add(ham);
            System.out.println("ham");
        }
    }
    public String calculatePrice(){
        this.total_price = this.base_price + addedPrice * this.additions.size();
        return "[Burger Name :" + this.name + " ][Roll Type : " +  this.breadRollType + " ][Meat : " + this.meat+ " ][Base Price: " + this.base_price + " ][Total Price : "+this.total_price+"]\n";
    }

    public void additionalPrice(){
        double additionalPrice = this.addedPrice * this.additions.size();
        System.out.println("Additional Price: " + additionalPrice);
    }

    public double getBase_price() {
        return base_price;
    }

    public void setDiscount(double discount){
        this.discount = discount;
    }
}
