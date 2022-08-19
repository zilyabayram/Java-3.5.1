package ru.netology.sqr;

public class SQRService {

    public int calcsqrt(int x, int y) {


        int quantity = 0;
        for (int border = 10; border <= 99; border++) {

            if (border * border <= y && border * border >= x) {
                quantity = quantity + 1;
            }
        }
        return (quantity);
    }
}

