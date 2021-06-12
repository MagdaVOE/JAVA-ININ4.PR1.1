package devices;

public class Phone extends Device {

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
}
