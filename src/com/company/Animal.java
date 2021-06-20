package com.company;

import javax.swing.*;
import java.io.File;
 public class Animal implements sellable {
    public String name;
   private Double weight;
   final public String species;
    File pic;

    public Animal(String name, Double weight, String species){
        this.name=name;
        this.weight=weight;
        this.species=species;
    }

    static final public Double DEFAULT_ANIMAL_WEIGHT =1.0;

    Animal(String species){
        this.species = species;
    switch(this.species){
        case"canine": this.weight=10.0;
        case "feline": this.weight=2.0;
        default: this.weight=DEFAULT_ANIMAL_WEIGHT;
    }

    }
    void feed(){
        this.weight+=1;
        System.out.println("thanks for food :D");}
        void takeForAWalk(){
            this.weight-=1;
            if (this.weight==0.0){
                System.out.println("Good job buddy, now it's dead ");}
        }
     @Override
     public String toString(){
         return "Animal{"+
                 "name=" +name+'\''+
                 ", weight=" +weight +'\'' +
                 "'species = "+ species+"}";}






     @Override
     public void sell(Human seller, Human buyer, Double price) {
         if(seller.pet != null){

                 System.out.println(seller.name + " woohoo, own a pet <3");}
             if(buyer.cash>price){
                 System.out.println(buyer.name +", you've got enough cash, good job buddy :) ");
                 buyer.cash-=price;
                 seller.cash+=price;
                 buyer.pet=seller.pet;
                 seller.pet=null;
                 System.out.println("transaction went great and everybody is happy now..... Shiny happy people laughing ");
             }
             else {
                 System.out.println("you are too poor, go get better job");
             }
         }


     @Override
     public void sell() {
         if (this instanceof Human){
             System.out.println("You cant sell human, those days are over..... you dont have to sell your body through the night..... STING :D");}

     }

 }



