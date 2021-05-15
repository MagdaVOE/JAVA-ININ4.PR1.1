package com.company;

public class Main {

    public static void main(String[] args) {
	Animal dog = new Animal( "canine");
	dog.name = "Szarik";

	Animal cat= new Animal("feline");
	cat.name="puszek";
	System.out.println("dog name =" + dog.name);


	Phone iphone= new Phone();
	iphone.producer ="apple";
	iphone.model="6s";

	Car cactus = new Car();
	cactus.model=" C4 cactus";
	cactus.producer="Citroen";
	cactus.year=2015;
	cactus.type="crossover";
	cactus.value=20000.0;

		Human me= new Human();
	me.name="Magda";
	me.lastName="Voelker";
	me.sex="Female";
	me.age=33;
	me.mobilePhone=iphone;



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
String version = iphone.getOSVersion();

System.out.println(iphone.getOSVersion());
    }
}
