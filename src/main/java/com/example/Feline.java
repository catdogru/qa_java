package com.example;

import com.example.constants.enums.Family;
import com.example.constants.enums.Food;

import java.util.List;

import static com.example.constants.enums.AnimalKind.PREDATOR;
import static com.example.constants.enums.Family.FELINES;

public class Feline extends Animal implements Predator {

    @Override
    public List<Food> eatMeat() throws Exception {
        return getFood(PREDATOR);
    }

    @Override
    public Family getFamily() {
        return FELINES;
    }

    public int getKittens() {
        return getKittens(1);
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

}
