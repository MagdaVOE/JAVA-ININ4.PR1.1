package com.company;
import devices.Car;
import devices.Phone;

import java.util.Date;

public class Human {
    String name;
    String lastName;
    String sex;
    Integer age;
    Animal pet;
    private Car car;
    Phone mobilePhone;
    private Double salary;

    public Human(String name, String lastName, String sex, int age, Animal pet, Car car) {
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.pet = pet;
        this.car = car;
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


    }public Car getCar() {

        return this.car;
    }
    public void setCar(Car car) {
        if (this.salary > car.value) {
            System.out.println("you bought it using cash, yeahhhh....");
            this.car = car;
        } else if (this.salary >= car.value / 12) {
            System.out.println("you bought it using credit, but its ok");
            this.car = car;
        } else {
            System.out.println("Sorry buddy first ask for a rise or get a better job");
        }

        this.car = car;
    }
}