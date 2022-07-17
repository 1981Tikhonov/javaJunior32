package lesson3;

public class HomeWork3 {

    public static void main(String[] args) {
        /**
         * Есть массив цифр (задайте его сами). Вывести на консоль:
         * 3) Все числа в обратном порядке. При этом дважды вывести те числа,
         * которые являются кратными трем.
         */

        int [] array = {1, 2, 3, 6, 5, 9, 7, 6, 12};

        for (int i = array.length - 1; i >= 0; i--){
            System.out.println(array[i]);
            if (array[i] % 3 ==0){
                System.out.println(array[i]);

            }


        }

    }
}
