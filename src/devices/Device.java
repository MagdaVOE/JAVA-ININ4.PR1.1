package devices;
import com.company.creatures.Human;
import com.company.sellable;

abstract public class Device implements sellable{
    public final String producer;
    public final String model;
    public final Integer year;
    public Double value;

    public Device(String producer,String model, Integer year, Double value){
        this.producer=producer;
        this.model=model;
        this.year=year;
        this.value=value;
    }


    public abstract int compareTo(Car o);

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (buyer.cash >= price) {
            seller.cash += price;
            buyer.cash -= price;
            System.out.println(buyer.name + " bought " + this.toString() + " from " + seller.name + " for " + price);
        } else {
           System.out.println("sorry, you have not enough money");
        }
    }

    @Override
    public String toString(){
        return "Device{"+
                "producer=" +producer+'\''+
                ", model=" +model +'\'' +
                "'production = "+ year+"}";

    }
    abstract public void turnOn();

}
