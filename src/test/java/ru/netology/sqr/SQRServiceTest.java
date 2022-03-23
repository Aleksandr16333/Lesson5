package ru.netology.sqr;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'Test1', 200, 300, 3",
            "'Test2', 400, 400, 1",
            "'Test3', 100, 200, 5",
            "'Test4', 300, 300, 0"})
    void calculate(String test, int min, int max, int expected) {
        SQRService service = new SQRService();

        int actual = service.calculate(min, max);
        assertEquals(expected, actual);
    }
}
