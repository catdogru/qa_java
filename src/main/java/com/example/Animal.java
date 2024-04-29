package com.example;

import com.example.constants.enums.AnimalKind;
import com.example.constants.enums.Family;
import com.example.constants.enums.Food;

import java.util.List;

import static com.example.constants.Constants.ExceptionMessages.UNKNOWN_ANIMAL_KIND_EXCEPTION_MESSAGE;
import static com.example.constants.Constants.HERBIVORE_MENU;
import static com.example.constants.Constants.PREDATOR_MENU;
import static com.example.constants.enums.AnimalKind.HERBIVORE;
import static com.example.constants.enums.AnimalKind.PREDATOR;
import static com.example.constants.enums.Family.UNKNOWN_FAMILY;

public class Animal {

    public List<Food> getFood(AnimalKind animalKind) throws Exception {
        if (HERBIVORE == animalKind) {
            return HERBIVORE_MENU;
        } else if (PREDATOR == animalKind) {
            return PREDATOR_MENU;
        } else {
            throw new Exception(UNKNOWN_ANIMAL_KIND_EXCEPTION_MESSAGE);
        }
    }

    public Family getFamily() {
        return UNKNOWN_FAMILY;
    }
}