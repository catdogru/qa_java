package com.example.constants.enums;

public enum AnimalSound {
    CAT_SOUND("Мяу");

    private final String sound;

    AnimalSound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}