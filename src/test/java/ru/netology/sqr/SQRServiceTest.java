package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void calculateNumberSquares() {
        SQRService SQRService = new SQRService();

        int expected = 10;
        int actual = SQRService.calculateNumberSquares(200, 600);
        assertEquals(expected, actual);
    }
}