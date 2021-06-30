package devices;

import com.company.creatures.Human;

public class LPG extends Car{
    public LPG(String producer, String model, Integer year, String type, Double value) {
        super(producer, model, year, type, value);
    }

    @Override
    public void refuel() {
System.out.println("psss, gasssss");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }

    @Override
    public void sell() {

    }
}
