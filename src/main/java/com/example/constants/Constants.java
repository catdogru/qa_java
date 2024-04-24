package com.example.constants;

import com.example.constants.enums.Food;

import java.util.List;

import static com.example.constants.enums.Food.*;

public interface Constants {
    List<Food> HERBIVORE_MENU = List.of(HERB, PLANTS);
    List<Food> PREDATOR_MENU = List.of(ANIMALS, BIRDS, FISH);

    interface ExceptionMessages {
        String UNKNOWN_SEX_VALUE_EXCEPTION_MESSAGE = "Используйте допустимые значения пола животного - самец или самка";
        String UNKNOWN_ANIMAL_KIND_EXCEPTION_MESSAGE = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
    }
}
