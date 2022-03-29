package ru.netology.sqr;

public class SQRService {
    public int calculate(int min, int max) {
        int calc = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min && i * i <= max) {
                calc = calc + 1;
            }

        }
        return calc;


    }

}
