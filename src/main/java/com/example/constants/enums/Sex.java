package com.example.constants.enums;

public enum Sex {
    MALE("Самец"),
    FEMALE("Самка"),
    UNKNOWN("Неизвестно");

    private final String sex;

    Sex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }
}
