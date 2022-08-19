package ru.netology.sqr;

public class Main {

    public static void main(String[] args) {

        //Филипп, знаю, что нужны говорящие названия, но если я меняю х и у на слова,
        //эти слова автоматически не подягиваются после service.calcsqrt.
        //прошу понять и простить.

        SQRService service = new SQRService();
        int sqrtQuantity = service.calcsqrt (200,300);
        System.out.println("Количество квадратов чисел от 10 до 99, " +
                "которые попали в заданный диапазон: " + sqrtQuantity);

    }

}

