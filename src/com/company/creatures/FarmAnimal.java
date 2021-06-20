package com.company.creatures;

public class FarmAnimal extends Animal implements Edible{

    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public void beEaten() {
        System.out.println("Yummy, yummy in my tummy, tummy ");
        this.weight = 0.0;
    }

    @Override
    public void feed(double foodWeight) {

    }
}
