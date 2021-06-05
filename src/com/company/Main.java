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



	Phone samsung= new Phone("Samsung","Galaxy","Android",123.4);



	Car cactus = new Car("C4 cactus", "Citroen",2017, "crossover", 20000.0);
	Car cactus2 = new Car("C4 cactus", "Citroen",2017, "crossover", 20000.0);


		System.out.println("Comparison:"+cactus.equals(cactus2));


 Human me=new Human("Magda", "Voelker", "Female",33,dog, cactus);


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


		}
}
