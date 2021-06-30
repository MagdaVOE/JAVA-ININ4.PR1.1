package com.company.creatures;
import devices.Car;
import devices.Phone;
import java. util. Arrays;
import java.util.Date;

public class Human extends Animal{
   public String name;
    public String lastName;
   public String sex;
    public Integer age;
    public Animal pet;
    public Car[] garage = new Car[3];
   public  Phone mobilePhone;
    private Double salary;
    public Double cash;


    public Human(String name, String lastName, String sex, int age, Animal pet, Car[] garage, Phone mobilePhone, Double salary, Double cash) {
        super(name);
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.pet = pet;
        this.garage = new Car[3];
        this.mobilePhone=mobilePhone;
        this.salary=salary;
        this.cash=cash;
    }
    public Human() {
        super("homo sapiens");
        this.cash = 1000d;
        this.garage = new Car[3];
    }

    public Human(Integer garage_size) {
        super("homo sapiens");
        this.cash = 1000d;
        this.garage = new Car[garage_size];
    }


    private Date SalaryDate;
    private Double previousSalary;



    public Double getSalary() {
        if (SalaryDate == null) {
            System.out.println("your salary data was never checked");
        } else {
            System.out.println("Your salary was checked;" + this.SalaryDate +" and it was:"+this.salary);
        }
        this.SalaryDate=new Date();
        this.previousSalary = this.salary;
        return this.salary;
    }

    public void setSalary(double salary) {
        if (salary < 0.0) {
            System.out.println("no way");
        } else {
            System.out.println("new data was send to accountant ");
            System.out.println("Go to miss Hania from HR for your contract annex");
            System.out.println("US and ZUS already know about your salary rise, taxes suck!!!!");
            this.salary = salary;
        }


    }

    @Override
    public String toString(){
        return "Human{"+
                "name=" +name+'\''+
                ", Last name= " +lastName +'\'' +
                ",sex = "+ sex+ '\''+
                ",age= " +age+'\''+
        ", pet = " +pet +'\'' +
                ", car = "+ garage +"}";}

    @Override
    public void feed(double foodWeight) {

    }
    public Car getCar(int carNumber) {
        return garage[carNumber];
    }


    public void removeCar(Car newCar) throws Exception {
        boolean success = false;
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == newCar) {
                garage[i] = null;
                success = true;
                break;
            }
        }
        if (!success) {
            throw new Exception("sorry dude, i dont have that car");
        }
    }


    public void setCar(Car newCar) throws Exception {
        boolean success = false;
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == null) {
                this.setCar(newCar, i);
                success = true;
                break;
            }
        }
        if (!success) {
            throw new Exception("no space in the garage");
        }

    }

    public void setCar(Car car, int carNumber) throws Exception {
        if (garage[carNumber] != null) {
            throw new Exception("this spot is taken");
        }

        this.garage[carNumber] = car;
        car.owners.add(this);
    }

    public Double getCarsValue() {
        Double sum = 0.0;
        for (Car car : garage) {
            if (car != null) {
                sum += car.value;
            }
        }
        return sum;
    }
    public Car[] getGarage() {
        return this.garage;
    }

    public boolean hasCar(Car newCar) {
        boolean hasCar = false;
        for (Car car : garage) {
            if (car == newCar) {
                return true;
            }
        }
        return false;
    }

    public boolean couldBuyCar(Car newCar, Double price) throws Exception {
        if (price > this.cash) {
            throw new Exception("sorry, no enough money");
        }
        if (!this.hasFreePlaceInGarage()) {
            throw new Exception("sorry, you dont have any space");
        }
        return true;
    }

    private boolean hasFreePlaceInGarage() {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == null) {
                return true;
            }
        }
        return false;
    }

}