package devices;

import com.company.creatures.Human;
import com.company.sellable;

public class Car extends Device implements sellable {
    public String type;
   public  Double value;



    public Car(String producer, String model, Integer year, String type, Double value) {
        super(producer, model, year);
        this.type = type;
        this.value = value;
    }
    @Override
    public void turnOn() {
        System.out.println("put the key in");
        System.out.println("turn the key");
        System.out.println("wrrrrr...");
        System.out.println("wrrrrr....");
        System.out.println("goog job, you are driving :D :D :D :D");


    }





    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.car != null){
            System.out.println(seller.name + " woohoo, owns a car <3");
            if(buyer.cash>price){
                System.out.println(buyer.name +", you've got enough cash, good job buddy :) ");
                buyer.cash-=price;
                seller.cash+=price;
                buyer.car=seller.car;
                seller.car=null;
                System.out.println("transaction went great and everybody is happy now..... Shiny happy people laughing ");
            }
            else {
                System.out.println("you are too poor, go get better job");
            }
        }

    }

    @Override
    public void sell() {

    }

}
