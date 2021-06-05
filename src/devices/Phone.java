package devices;

public class Phone {
    String producer;
    String model;
    String operatingSystem;
    Double screenSize;

    String getOSVersion(){
        return "5.32.1";
    }

    public Phone( String producer, String model, String operatingSystem, Double screenSize){
        this.producer=producer;
        this.model=model;
        this.operatingSystem=operatingSystem;
        this.screenSize=screenSize;
    }

}
