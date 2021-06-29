package devices;

public class Diesel extends Car{
    public Diesel(String producer, String model, Integer year, String type, Double value) {
        super(producer, model, year, type, value);
    }

    @Override
    public void refuel() {
        System.out.println("Im so expensive, you about to go broke, SAVE the EARTH ");
    }
}
