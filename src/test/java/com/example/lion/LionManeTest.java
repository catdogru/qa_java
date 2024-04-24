package com.example.lion;

import com.example.Lion;
import com.example.constants.enums.Sex;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static com.example.constants.enums.Sex.*;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionManeTest {
    private final Sex sex;
    private final boolean hasMane;

    public LionManeTest(Sex sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameters()
    public static Object[][] getData() {
        return new Object[][]{
                {FEMALE, false},
                {MALE, true},
        };
    }

    @Test
    public void doesHaveMane() throws Exception {
        assertEquals( new Lion(sex).doesHaveMane(), hasMane);
    }

    @Test(expected = Exception.class)
    public void unknownSexShouldThrowException() throws Exception {
        new Lion(UNKNOWN).doesHaveMane();
    }
}