package com.company;

import com.company.creatures.Human;
import com.company.creatures.Pet;
import devices.*;

import java.util.*;
public class Main {

    public static void main(String[] args) throws Exception {

	Pet dog = new Pet( "canine");
	dog.name = "Szarik";

	Pet cat= new Pet("feline");
	cat.name="puszek";
	System.out.println("dog name =" + dog.name);



	Phone samsung= new Phone("Android","galaxy",2010,"Android", 12.3, 1000.0);
Phone iphone = new Phone("Apple", "11 pro", 2020,"iOS",10.0 , 1200.0);


	Car cactus = new Electric("C4 cactus", "Citroen",2017,"crossover",20000.0);
	Car cactus2 = new Diesel("C4 cactus", "Citroen",2016,"crossover",20000.0);
		Car cactus3 = new Diesel("C4 cactus", "Citroen",2018,"crossover",20000.0);


		System.out.println("Comparison:"+cactus.equals(cactus2));

		Human me = new Human(3);
		me.name = "Magda";
		me.lastName = "Voelke";
		me.pet = new Pet("cat");
		me.pet.name = "Tyff Tyff";
		System.out.println();

		Human Chandler= new Human(3);
		Chandler.name = "Chandler";
		Chandler.lastName = "Bing";
		Chandler.pet = new Pet("dog");
		Chandler.pet.name = "Ludwig";
		Chandler.setSalary(15000.0);


		//Human me=new Human("Magda", "Voelker", "Female",33,dog,cactus,samsung,5000.0, 5000.0);
//Human Chandler=new Human("Chandler", "Bing","male",21,cat,2,iphone,4000.0,5000.0);

		Double salary = me.getSalary();
		me.setSalary(15000.0);

		//Double salary1 = me.getSalary();
		//me.setSalary(10000.0);

		//Car car=me.getCar();
		//me.setCar(cactus);
		//me.setCar(cactus, 0);
	//	me.setCar(cactus2, 1);
	//	me.setCar(cactus3, 2);

		//System.out.println("My cars are worth:"+me.getCarsValue());



		//System.out.println(me.getCar(0));
		//System.out.println(me.getCar(1));
		//System.out.println(me.getCar(2));


	//	List<Car> cars = new LinkedList<Car>();
		//cars.add(cactus);
	//	cars.add(cactus2);
	//	cars.add(cactus2);
	//	cars.add(cactus3);
		//cars.addAll(Arrays.asList(me.getGarage()));

		//System.out.println(cars.get(2));
		//System.out.println(cars.size());
		//System.out.println(cars.isEmpty());



	//	me.getCar(0).sell(me,
				//Chandler,
				//10.0);


		//System.out.println(cactus.owners);

		//Human Monica = new Human();
		//Monica.name = "Monica";
	//Monica.lastName = "Bing";
	//	Monica.pet = new Pet("dog");
	//	Monica.pet.name = "Major";
	//	Monica.setSalary(17000.0);

	//	me.getCar(1).sell(me, Monica, 200.0);


		//Human Phoebe= new Human(3);
		//Phoebe.name = "Phoebe";
		//Phoebe.lastName = "Buffe";
		//Phoebe.pet = new Pet("Cat");
		//Phoebe.pet.name="Smelly Cat";
		//Phoebe.setSalary(6000.0);

	//	Monica.getCar(0).sell(Monica, Phoebe, 1.0);

		//System.out.println("Cars owners: "+cactus.owners);


		me.mobilePhone = samsung;
		samsung.owner = me;
		me.cash = 700.;

		Application YTMusic = new Application("YTMusic", "2.0", 0.);
		Application Instagram = new Application("Instagram", "4.5", 0.);
		Application Facebook = new Application("Facebook", "2.2", 14.);
		Application MiFit = new Application("MiFit", "11.9", 9.);
		Application Netflix = new Application("Netflix", "4.0", 10.);

		samsung.installApp(YTMusic);
		samsung.installApp(Instagram);
		samsung.installApp(Facebook);
		samsung.listAllAppsAlphabetical();
		samsung.listAllFreeApps();
		System.out.println();

		System.out.println("Is YTMusic installed: " + samsung.isThisAppInstalled(YTMusic));
		System.out.println("Is Instagram installed: " + samsung.isThisAppInstalled(Instagram));
		System.out.println("Is Netflix installed: " + samsung.isThisAppInstalled("Netflix"));
		System.out.println();

		samsung.installApp(Instagram);
		samsung.installApp(Netflix);

		samsung.listAllAppsSortedByPrice();
		System.out.println();
		System.out.println("Value of installed apps: " + samsung.valueOfAllApps());

//dog.feed();
//cat.takeForAWalk();
//cat.takeForAWalk();
//		cat.takeForAWalk();
//String version = samsung.getOSVersion();

//System.out.println(samsung.getOSVersion());

		//System.out.println(me);
		//System.out.println(cactus);
		//System.out.println(cactus2);

//System.out.println(me);
//System.out.println(dog);
//System.out.println(cactus);
//System.out.println(samsung);

//samsung.turnOn();
//cactus.turnOn();

//me.sell(me,Chandler,20000.0);
		}


}