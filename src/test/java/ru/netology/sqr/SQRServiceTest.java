package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource (files = "src/test/resources/sqrdata.csv")

    public void shouldCalcIfBorders (int expected, int x, int y) {
        SQRService service = new SQRService();

        int actual = service.calcsqrt(x,y);
        Assertions.assertEquals(expected, actual);
    }

}
