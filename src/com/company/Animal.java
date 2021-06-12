package com.company;

import java.io.File;
 public class Animal {
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

     }


