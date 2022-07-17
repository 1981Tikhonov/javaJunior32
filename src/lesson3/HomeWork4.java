package lesson3;

public class HomeWork4 {

        public static void main(String[] args) {
        /**
         * Есть массив цифр (задайте его сами). Вывести на консоль:
         * 4) ***Только те числа, которые содержат в себе символ 4 (не для всех)
         */

        int[] array = {2, 15, 45, 67, 60, 54, 74, 80};


        for (int i = 0; i < array.length; i++){
            int w = array [i];
            String wsrt = Integer.toString(w);

            if (wsrt.contains("4") ){
                System.out.println(w);
            }

        }

    }
}




//
//if (array[i] = 4;){
//        System.out.println(array[i]);