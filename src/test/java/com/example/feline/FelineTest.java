package com.example.feline;

import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import static com.example.constants.Constants.PREDATOR_MENU;
import static com.example.constants.enums.Family.FELINES;
import static org.junit.Assert.assertEquals;


public class FelineTest {
    private Feline feline;

    @Before
    public void setUp() {
        feline = new Feline();
    }

    @Test
    public void eatMeatShouldReturnPredatorMenu() throws Exception {
        assertEquals(PREDATOR_MENU, feline.eatMeat());
    }

    @Test
    public void getFamilyShouldReturnFelines() {
        assertEquals(FELINES, feline.getFamily());
    }

    @Test
    public void getKittensShouldReturnOne() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensWithParamTest() {
        int kittensCountValue = 5;
        assertEquals(kittensCountValue, feline.getKittens(kittensCountValue));
    }
}