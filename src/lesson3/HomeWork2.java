package lesson3;

public class HomeWork2 {

    public static void main(String[] args) {

        /**
         * Есть массив цифр (задайте его сами). Вывести на консоль:
         * 2) Все числа с массива, которые больше 10, но меньше 25.
         */

        int[] array = {25, 13, 42, 18, 19, 6, 45, 24};

       for (int i = 0; i < array.length; i++){
           if (array[i] > 10 && array[i] < 25){
               System.out.println(array[i]);
           }
       }

    }
}


