package devices;

abstract public class Device {
    public final String producer;
    public final String model;
    public final Integer year;

    public Device(String producer,String model, Integer year){
        this.producer=producer;
        this.model=model;
        this.year=year;
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
