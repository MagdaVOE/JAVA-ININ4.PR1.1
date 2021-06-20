package com.company;

import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) {

	Animal dog = new Animal( "canine");
	dog.name = "Szarik";

	Animal cat= new Animal("feline");
	cat.name="puszek";
	System.out.println("dog name =" + dog.name);



	Phone samsung= new Phone("Android","galaxy",2010,"Android", 12.3);
Phone iphone = new Phone("Apple", "11 pro", 2020,"iOS",10.0 );


	Car cactus = new Car("C4 cactus", "Citroen",2017,"crossover",20000.0);
	Car cactus2 = new Car("C4 cactus", "Citroen",2017,"crossover",20000.0);


		System.out.println("Comparison:"+cactus.equals(cactus2));


 Human me=new Human("Magda", "Voelker", "Female",33,dog, cactus,samsung,5000.0, 5000.0);
Human Chandler=new Human("Chandler", "Bing","male",21,cat,cactus2,iphone,4000.0,5000.0);

		Double salary = me.getSalary();
		me.setSalary(15000.0);

		Double salary1 = me.getSalary();
		me.setSalary(10000.0);

		Car car=me.getCar();
		me.setCar(cactus);


dog.feed();
cat.takeForAWalk();
cat.takeForAWalk();
		cat.takeForAWalk();
String version = samsung.getOSVersion();

System.out.println(samsung.getOSVersion());

		System.out.println(me);
		System.out.println(cactus);
		System.out.println(cactus2);

System.out.println(me);
System.out.println(dog);
System.out.println(cactus);
System.out.println(samsung);

samsung.turnOn();
cactus.turnOn();

me.sell(me,Chandler,20000.0);
		}
}
