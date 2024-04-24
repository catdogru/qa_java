package com.example.cat;

import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.constants.Constants.HERBIVORE_MENU;
import static com.example.constants.Constants.PREDATOR_MENU;
import static com.example.constants.enums.AnimalSound.CAT_SOUND;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    private Cat cat;

    @Spy
    Feline feline;

    @Before
    public void setUp() {
        cat = new Cat(feline);
    }

    @Test
    public void getSoundShouldReturnCatSound() {
        assertEquals(CAT_SOUND, cat.getSound());
    }

    @Test
    public void getFoodShouldReturnPredatorMenu() throws Exception {
        assertEquals(PREDATOR_MENU, cat.getFood());
    }

    @Test
    public void getVeganCatFoodTest() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(HERBIVORE_MENU);
        assertNotEquals(PREDATOR_MENU, cat.getFood());
    }
}