package devices;
import java.util.LinkedList;
import java.util.List;

import com.company.creatures.Human;
import com.company.sellable;

public abstract class Car extends Device implements sellable {
    public String type;
   public  Double value;
    public List<Human> owners = new LinkedList<Human>();



    public Car(String producer, String model, Integer year, String type, Double value) {
        super(producer, model, year, value);
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

    public abstract void refuel();

    @Override
    public void sell() {
        System.out.println("Car sold");
    }

    @Override
    public int compareTo(Car o) {
        return o.value.intValue() - this.value.intValue();
    }

    public void sell(Human seller, Human buyer, Double price) throws Exception {

        if (buyer.couldBuyCar(this, price) && seller.hasCar(this)) {
            buyer.setCar(this);
            seller.removeCar(this);
            buyer.cash -= price;
            seller.cash += price;
            System.out.println("transaction went great " + seller + " sold " + this + " to " + buyer);
        }


    }




   //public abstract void refuel();
}

