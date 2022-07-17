package lesson3;

public class HomeWork1 {

    public static void main(String[] args) {
        /**
         *Есть массив цифр (задайте его сами). Вывести на консоль:
         * 1) Сколько в массиве четных цифр?
         *
         */

        int[] array = {2, 3, 4, 8, 9, 6, 4, 2};

        int howManyEvenNumbers = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                howManyEvenNumbers = howManyEvenNumbers + 1;

            }
        }
        System.out.println(howManyEvenNumbers);


    }
}
