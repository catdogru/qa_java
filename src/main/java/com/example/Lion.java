package com.example;

import com.example.constants.enums.Food;
import com.example.constants.enums.Sex;

import java.util.List;

import static com.example.constants.Constants.ExceptionMessages.UNKNOWN_SEX_VALUE_EXCEPTION_MESSAGE;
import static com.example.constants.enums.AnimalKind.PREDATOR;
import static com.example.constants.enums.Sex.FEMALE;
import static com.example.constants.enums.Sex.MALE;

public class Lion {

    boolean hasMane;

    public Lion(Sex sex) throws Exception {
        if (MALE == sex) {
            hasMane = true;
        } else if (FEMALE == sex) {
            hasMane = false;
        } else {
            throw new Exception(UNKNOWN_SEX_VALUE_EXCEPTION_MESSAGE);
        }
    }

    Feline feline = new Feline();

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<Food> getFood() throws Exception {
        return feline.getFood(PREDATOR);
    }
}
