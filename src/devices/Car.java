package devices;

public class Car extends Device {
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
}
