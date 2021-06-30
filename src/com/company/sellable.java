package com.company;

import com.company.creatures.Human;

public interface sellable {
    public void sell(Human seller, Human buyer, Double price) throws Exception;

    void sell();
}
