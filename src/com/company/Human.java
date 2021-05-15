package com.company;
import java.util.Date;

public class Human {
    String name;
    String lastName;
    String sex;
    Integer age;
    Animal pet;
    Car car;
    Phone mobilePhone;
    private Double salary;



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
}