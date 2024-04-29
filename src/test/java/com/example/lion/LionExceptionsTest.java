package com.example.lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.constants.enums.Sex.UNKNOWN;

@RunWith(MockitoJUnitRunner.class)
public class LionExceptionsTest {
    @Mock
    private Feline feline;

    @Test(expected = Exception.class)
    public void unknownSexShouldThrowException() throws Exception {
        new Lion(UNKNOWN, feline).doesHaveMane();
    }
}