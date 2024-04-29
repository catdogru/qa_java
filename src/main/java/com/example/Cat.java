package com.example;

import com.example.constants.enums.AnimalSound;
import com.example.constants.enums.Food;

import java.util.List;

import static com.example.constants.enums.AnimalSound.CAT_SOUND;

public class Cat {
    Predator predator;

    public Cat(Feline feline) {
        this.predator = feline;
    }

    public AnimalSound getSound() {
        return CAT_SOUND;
    }

    public List<Food> getFood() throws Exception {
        return predator.eatMeat();
    }
}
