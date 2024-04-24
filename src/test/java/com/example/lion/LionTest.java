package com.example.lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

import static com.example.constants.Constants.PREDATOR_MENU;
import static com.example.constants.enums.AnimalKind.PREDATOR;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.quality.Strictness.LENIENT;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule().strictness(LENIENT);

    private Lion lion;

    @Spy
    private Feline feline;

    @Before
    public void setUp() {
        lion = new Lion(feline);
    }

    @Test
    public void getKittensShouldInvokeFeline() {
        lion.getKittens();
        verify(feline, times(1)).getKittens();
    }

    @Test
    public void getKittensCountShouldReturnOne() {
        lion.getKittens();
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void getFoodShouldInvokeFeline() throws Exception {
        lion.getFood();
        verify(feline).getFood(PREDATOR);
    }

    @Test
    public void getFoodShouldEqualsPredatorMenu() throws Exception {
        assertEquals(PREDATOR_MENU, lion.getFood());
    }
}