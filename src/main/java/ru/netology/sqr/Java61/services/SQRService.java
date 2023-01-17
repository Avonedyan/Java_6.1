package ru.netology.sqr.Java61.services;

public class SQRService {

    public static int sqrService(int x, int y) {
        int i;
        int sqrQuantity = 0;
        for (i = 10; i < 100; i++) {
            if ((i * i >= x) & (i * i <= y)) {
                sqrQuantity++;
            }
        }
        return sqrQuantity;
    }
}