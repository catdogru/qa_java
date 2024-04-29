package com.example.constants.enums;

public enum Food {
    HERB("Трава"),
    PLANTS("Различные растения"),
    ANIMALS("Животные"),
    BIRDS("Птицы"),
    FISH("Рыба");

    private final String food;

    Food(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }
}
