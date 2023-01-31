package ru.netology.sqr.Java61.services;

public class SQRService {

    public static int sqrService(int min, int max) {
        int i;
        int sqrQuantity = 0;
        for (i = 10; i < 100; i++) {
            if ((i * i >= min) & (i * i <= max)) {
                sqrQuantity++;
            }
        }
        return sqrQuantity;
    }
}