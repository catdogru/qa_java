package com.example.constants.enums;

public enum AnimalKind {
    HERBIVORE("Травоядное"),
    PREDATOR("Хищник");

    private final String kind;

    AnimalKind(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }
}
