package devices;

import com.company.creatures.Human;
import com.company.sellable;
import java.util.Comparator;
import java.util.ArrayList;
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
    public List<Application> appsInstalled = new ArrayList<Application>();
    public Human owner = null;
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
    public void installApp(Application app) {
        if (owner != null) {
            if (owner.cash > app.price) {
                if (isThisAppInstalled(app) == false) {
                    appsInstalled.add(app);
                    owner.cash -= app.price;

                } else {
                    System.out.println("App " + app.name + " is already installed");
                }
            } else {
                System.out.println("you don't have enough cash, go get better job looser " + app.name);
            }
        } else {
            System.out.println("Error: this phone doesn't have an owner  ");
        }
    }

    public boolean isThisAppInstalled(Application app){
        return appsInstalled.contains(app);
    }

    public boolean isThisAppInstalled(String name){
        for (int i =0; i<appsInstalled.size();i++){
            if ( name.equals(appsInstalled.get(i).name)){
                return true;
            }
        }
        return false;
    }

    public double valueOfAllApps(){
        double a = 0.;
        for (int i =0; i<appsInstalled.size();i++){
            a += appsInstalled.get(i).price;
        }
        return a;
    }

    public void listAllFreeApps(){
        System.out.println("\nList of installed free apps:");
        for (int i =0; i<appsInstalled.size();i++){
            if (appsInstalled.get(i).price == 0.){
                System.out.println(appsInstalled.get(i).toString());
            }
        }
    }

    public void listAllAppsAlphabetical(){
        System.out.println("\nAlpabetical list of apps:");
        List<Application> temp = appsInstalled;
        Comparator<Application> Lambda = (app1,app2) -> app1.name.compareTo(app2.name);
        temp.sort(Lambda);
        System.out.println(temp);
    }

    public void listAllAppsSortedByPrice(){
        System.out.println("\nPrice sorted apps:");
        List<Application> temp = appsInstalled;
        Comparator<Application> Lambda = (app1,app2) -> app1.price.compareTo(app2.price);
        temp.sort(Lambda);
        System.out.println(temp);
    }

    //  public void installAnApp(List<String> appNames){
//for (String appName : appNames){
  //  installAnApp(appName);
//}
   // }

  //  public void installAnApp(String appName){
    //    this.installAnApp( appName, DEFAULT_APP_VERSION);
   // }
   // public void installAnApp(String appName, String version){
     //   this.installAnApp( appName,version, DEFAULT_APP_SERVER);
    //}
    //public void installAnApp(String appName, String version, String address){
      //  URL url = null;
        //try {
          //  url = new URL(DEFAULT_APP_PROTOCOL, address, DEFAULT_APP_PORT, appName+"-" + version);
            //this.installAnApp(url);
       // } catch (MalformedURLException e) {
         //   e.printStackTrace();
        //}

    //}
    //public void installAnApp(URL url){
      //  System.out.println("checking disc space");
        //System.out.println(" checking parental control settings ");
      //  System.out.println(" checking available cash");
      //  System.out.println("pay service");
       // System.out.println("payment authorized");
        //System.out.println("downloading an app.. wait for it...wait for it..");
       // System.out.println("unzipping the app");
       // System.out.println(" installing an app... wait for it...");
       // System.out.println("error handling ");
       // System.out.println(" app successfully installed hooray :)"+ url.getFile());

    //}
}
