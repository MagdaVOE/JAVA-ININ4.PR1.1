package devices;

public class LPG extends Car{
    public LPG(String producer, String model, Integer year, String type, Double value) {
        super(producer, model, year, type, value);
    }

    @Override
    public void refuel() {
System.out.println("psss, gasssss");
    }
}
