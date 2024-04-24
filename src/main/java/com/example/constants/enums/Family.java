package com.example.constants.enums;

public enum Family {
    HARES("Заячьи"),
    SQUIRRELS("Беличьи"),
    MOUSE("Мышиные"),
    FELINES("Кошачьи"),
    HOUNDS("Псовые"),
    BEAR("Медвежьи"),
    MARTENS("Куньи"),
    UNKNOWN_FAMILY("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи");

    private final String family;

    Family(String family) {
        this.family = family;
    }

    public String getFamily() {
        return family;
    }
}
