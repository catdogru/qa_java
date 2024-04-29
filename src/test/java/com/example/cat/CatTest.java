package com.example.cat;

import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.constants.Constants.PREDATOR_MENU;
import static com.example.constants.enums.AnimalSound.CAT_SOUND;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    private Cat cat;

    @Mock
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
        Mockito.when(feline.eatMeat()).thenReturn(PREDATOR_MENU);
        assertEquals(PREDATOR_MENU, cat.getFood());
    }
}