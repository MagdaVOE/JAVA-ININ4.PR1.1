package devices;

import com.company.creatures.Human;
import com.company.sellable;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Phone extends Device implements sellable {

    private static final String DEFAULT_APP_VERSION = "latest";
    private static final String DEFAULT_APP_SERVER = "https://app.server.com";
    private static final String DEFAULT_APP_PROTOCOL = "https";
    private static final int DEFAULT_APP_PORT = 443;
    public String operatingSystem;
   public  Double screenSize;

    public Phone(String producer, String model, Integer year,String operatingSystem, Double screenSize, Double value) {
        super(producer,model,year,value);
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

    @Override
    public int compareTo(Car o) {
        return 0;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.mobilePhone != null){
            System.out.println(seller.name + " woohoo, owns a phone <3");
            if(buyer.cash>price){
                System.out.println(buyer.name +", you've got enough cash, good job buddy :) ");
                buyer.cash-=price;
                seller.cash+=price;
                buyer.mobilePhone=seller.mobilePhone;
                seller.mobilePhone=null;
                System.out.println("transaction went great and everybody is happy now..... Shiny happy people laughing ");
            }
            else {
                System.out.println("you are too poor, go get better job");
            }

        }

    }

    @Override
    public void sell() {

    }
    public void installAnApp(List<String> appNames){
for (String appName : appNames){
    installAnApp(appName);
}
    }

    public void installAnApp(String appName){
        this.installAnApp( appName, DEFAULT_APP_VERSION);
    }
    public void installAnApp(String appName, String version){
        this.installAnApp( appName,version, DEFAULT_APP_SERVER);
    }
    public void installAnApp(String appName, String version, String address){
        URL url = null;
        try {
            url = new URL(DEFAULT_APP_PROTOCOL, address, DEFAULT_APP_PORT, appName+"-" + version);
            this.installAnApp(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
    public void installAnApp(URL url){
        System.out.println("checking disc space");
        System.out.println(" checking parental control settings ");
        System.out.println(" checking available cash");
        System.out.println("pay service");
        System.out.println("payment authorized");
        System.out.println("downloading an app.. wait for it...wait for it..");
        System.out.println("unzipping the app");
        System.out.println(" installing an app... wait for it...");
        System.out.println("error handling ");
        System.out.println(" app successfully installed hooray :)"+ url.getFile());

    }
}
