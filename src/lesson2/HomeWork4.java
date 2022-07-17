package lesson2;

public class HomeWork4 {
    public static void main(String[] args) {

        /**
         *  Вывести на консоль все числа от 20 до 60,
         *  пропуская диапазон от 30 до 40 включительно
         */

        for (int i = 20; i <= 60 ; i++) {
            if ( i<30 | i > 40) {
                System.out.println(i);
            }
        }

    }
}