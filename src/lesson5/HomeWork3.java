package lesson5;

public class HomeWork3 {

    public static int punctuationMarksMnTheText(String str) {

        /**
         * 3) Метод принимает входящими параметрами текст,
         * и печатает на консоль сколько в тексте знаков пунктуации
         *
         */

        char[] symbols = new char[]{',', '.'};
        int counter =0;
        char[] punctuation = str.toCharArray();

        for (char ch1 : punctuation){
            for (char ch2 : symbols){
                if (ch1 == ch2){
                    counter ++;
                }

            }
        }
        return counter;
    }

}
