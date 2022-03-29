package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'calculating the internal limit', 200, 300, 3",
            "'calculating the upper limit', 400, 400, 1",
            "'calculating the lower limit', 100, 200, 5",
            "'Calculating the upper limit', 300, 300, 0"})
    void calculate(String test, int min, int max, int expected) {
        SQRService service = new SQRService();

        int actual = service.calculate(min, max);
        assertEquals(expected, actual);
    }
}
