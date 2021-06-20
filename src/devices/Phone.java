package devices;

import com.company.Human;
import com.company.sellable;

public class Phone extends Device implements sellable {

    public String operatingSystem;
   public  Double screenSize;

    public Phone(String producer, String model, Integer year,String operatingSystem, Double screenSize) {
        super(producer, model, year);
        this.screenSize=screenSize;
    }

    public String getOSVersion(){
        return "5.32.1";
    }


    @Override
    public void turnOn() {
        System.out.println("push button");
        System.out.println("wait...");
        System.out.println("little longer...");
        System.out.println("I SAID WAIT....");
        System.out.println("au... it's working :D :D :D :D");

    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.mobilePhone != null){
            System.out.println(seller.name + " woohoo, owns a phone <3");
            if(buyer.cash>price){
                System.out.println(buyer.name +", you've got enough cash, good job buddy :) ");
                buyer.cash-=price;
                seller.cash+=price;
                buyer.mobilePhone=seller.mobilePhone;
                seller.mobilePhone=null;
                System.out.println("transaction went great and everybody is happy now..... Shiny happy people laughing ");
            }

        }

    }

    @Override
    public void sell() {

    }
}
