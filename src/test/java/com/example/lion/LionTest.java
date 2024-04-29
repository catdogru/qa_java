package com.example.lion;

import com.example.Feline;
import com.example.Lion;
import com.example.constants.enums.Sex;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static com.example.constants.enums.AnimalKind.PREDATOR;
import static com.example.constants.enums.Sex.FEMALE;
import static com.example.constants.enums.Sex.MALE;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.quality.Strictness.LENIENT;

@RunWith(Parameterized.class)
public class LionTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule().strictness(LENIENT);

    private Lion lion;
    private final Sex sex;

    @Mock
    private Feline feline;

    public LionTest(Sex sex) {
        this.sex = sex;
    }

    @Parameterized.Parameters()
    public static Object[][] getData() {
        return new Object[][]{
                {FEMALE},
                {MALE},
        };
    }

    @Before
    public void setUp() throws Exception {
        lion = new Lion(sex, feline);
    }

    @Test
    public void getKittensShouldInvokeFeline() {
        lion.getKittens();
        verify(feline, times(1)).getKittens();
    }

    @Test
    public void getKittensCountShouldReturnOne() {
        Mockito.when(lion.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void getFoodShouldInvokeFeline() throws Exception {
        lion.getFood();
        verify(feline).getFood(PREDATOR);
    }
}