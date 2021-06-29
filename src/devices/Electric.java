package devices;

public class Electric extends Car{
    public Electric(String producer, String model, Integer year, String type, Double value) {
        super(producer, model, year, type, value);
    }

    @Override
    public void refuel() {
        System.out.println("I'm charging, hooray");
    }
}
