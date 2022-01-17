package ru.netology.sqr;

public class SQRService {

    public int calculateNumberSquares(int lowerBound, int upperBound) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerBound) {
                if (i * i <= upperBound) {
                    counter = counter + 1;
                }
            }
        }
        System.out.println(counter);
        return counter;
    }

}
